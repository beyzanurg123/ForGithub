package com.beyza.myapplication5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony.Mms.Part.TEXT
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.xmlpull.v1.XmlPullParser.TEXT

class devmzlksyfa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_devmzlksyfa)


        val textView = findViewById<TextView>(R.id.text)

        val queue = Volley.newRequestQueue(this)
        val url = "http://10.0.2.2:5000/devmszlk"

        val stringRequest = StringRequest(Request.Method.GET, url,
            Response.Listener<String> { response ->
                textView.text = "Response is: ${response.substring(0, 500)}"
            },
            Response.ErrorListener { textView.text = "That didn't work!" })

        queue.add(stringRequest)
        /*
        var volleyrequestQueue: RequestQueue? = null
        val serverapı: String = "http://10.0.2.2:5000/devmszlk"
        val TAG = "my api"

        volleyrequestQueue = Volley.newRequestQueue(this)
        val parameters: MutableMap<String, String> = HashMap()


        /*    val strReq: StringRequest = object : StringRequest(
                Method.GET, serverapı,
                Response.Listener { response ->

                })
    */

*/
    }
}