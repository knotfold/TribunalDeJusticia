package com.example.pcwin.tribunaldejusticia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class DirectorioMagistradosActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    public RecyclerView.Adapter adapterRV;

    public List<ListItemMagistrados> listItem;

    String URL_DATA = "https://rentame.000webhostapp.com/obtener_directorio_magistrados.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directorio_magistrados);

        recyclerView = (RecyclerView) findViewById(R.id.recycleViewMagistrados);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


        recyclerView.setAdapter(adapterRV);

        listItem = new ArrayList<>();

        loadRecyclerViewData(URL_DATA);


    }


    public void loadRecyclerViewData(String url) {


        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {

                        try {
                            JSONObject jsonObject = new JSONObject(s);
                            JSONArray array = jsonObject.getJSONArray("result");
                            if (String.valueOf(array).equals("[]")) {
                                Toast.makeText(getApplicationContext(), "No se encontraron Sentencias", Toast.LENGTH_LONG).show();
                            }

                            for (int i = 0; i < array.length(); i++) {
                                JSONObject o = array.getJSONObject(i);
                                ListItemMagistrados item = new ListItemMagistrados(
                                        o.getString("foto_url"),
                                        o.getString("grado_estudios"),
                                        o.getString("nombre"),
                                        o.getString("cargo"),
                                        o.getString("mail"),
                                        o.getString("sintesis_url")


                                );
                                listItem.add(item);
                            }
                            adapterRV = new MyAdapterMagistrados(listItem, getApplicationContext());
                            recyclerView.setAdapter(adapterRV);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
        requestQueue.add(stringRequest);

    }
}
