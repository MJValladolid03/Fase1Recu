package com.marisma.fase1recu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.marisma.fase1recu.databinding.FragmentDetailFavItemBinding

class DetailFavItemFragment : Fragment() {

    // Declaración de la variable para el binding
    private var _binding: FragmentDetailFavItemBinding? = null
    private val binding get() = _binding!!

    // onCreateView se llama cuando el fragmento debe crear su interfaz de usuario
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el layout del fragmento usando View Binding
        _binding = FragmentDetailFavItemBinding.inflate(inflater, container, false)
        return binding.root // Devolver la raíz del layout inflado
    }

    // onViewCreated se llama después de que onCreateView haya completado
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Realizar cualquier configuración adicional después de que la vista se haya creado
    }

    // onDestroyView se llama cuando la vista del fragmento está siendo destruida
    override fun onDestroyView() {
        super.onDestroyView()
        // Limpiar la referencia al binding para evitar fugas de memoria
        _binding = null
    }
}
