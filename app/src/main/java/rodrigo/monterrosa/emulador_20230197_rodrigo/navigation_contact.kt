package rodrigo.monterrosa.emulador_20230197_rodrigo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


class navigation_contact : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root =  inflater.inflate(R.layout.fragment_navigation_contact, container, false)

        val btnEmail = root.findViewById<Button>(R.id.btnClickEmail)
        btnEmail.setOnClickListener {
            Toast.makeText(this.context, "20230197@ricaldone.edu.sv", Toast.LENGTH_SHORT).show()
        }


        return root

    }

}