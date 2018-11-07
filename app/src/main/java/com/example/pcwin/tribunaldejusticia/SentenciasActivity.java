package com.example.pcwin.tribunaldejusticia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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

import java.util.List;

public class SentenciasActivity extends AppCompatActivity {

    private RecyclerView recyclerViewSentencias;
    public RecyclerView.Adapter adapterRVSentencias;

    public List<ListItemSentencias> listItem;

    String URL_DATA = "https://rentame.000webhostapp.com/get_departamentov2.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentencias);

        recyclerViewSentencias = (RecyclerView) findViewById(R.id.recycleViewSentencias);
        recyclerViewSentencias.setHasFixedSize(true);
        recyclerViewSentencias.setLayoutManager(new LinearLayoutManager(getApplicationContext()));



        recyclerViewSentencias.setAdapter(adapterRVSentencias);

        loadRecyclerViewData(URL_DATA);
    }




    public void loadRecyclerViewData(String url)
    {


        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {

                        try {
                            JSONObject jsonObject = new JSONObject(s);
                            JSONArray array = jsonObject.getJSONArray("result");
                            if(String.valueOf(array).equals("[]")) {
                                Toast.makeText(getApplicationContext(), "No se encontraron Sentencias", Toast.LENGTH_LONG).show();
                            }

                            for(int i = 0; i<array.length();i++)
                            {
                                JSONObject o = array.getJSONObject(i);
                                ListItemSentencias item = new ListItemSentencias(
                                        o.getString("idSentencia"),
                                        o.getString("expediente"),
                                        o.getString("magistrado"),
                                        o.getString("fecha"),
                                        o.getString("url_pdf")



                                );
                                listItem.add(item);
                            }
                            adapterRVSentencias = new MyAdapterSentencias(listItem,getApplicationContext());
                            recyclerViewSentencias.setAdapter(adapterRVSentencias);

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
