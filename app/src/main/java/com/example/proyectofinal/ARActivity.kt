package com.example.proyectofinal

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.vuforia.engine.core.CameraDevice
import com.vuforia.engine.core.Renderer
import com.vuforia.engine.CoreSampleTools.Renderer
import com.vuforia.engine.core.Renderer

class ARActivity : AppCompatActivity() {
    private lateinit var vuforiaRenderer: Renderer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ar)

        // Inicializar Vuforia
        vuforiaRenderer = Renderer(this)
        vuforiaRenderer.init(CameraDevice.CAMERA_DIRECTION.CAMERA_DIRECTION_DEFAULT)

        // Escuchar detección de objetos (ejemplo)
        vuforiaRenderer.setObjectDetectionListener { objectName ->
            runOnUiThread {
                Toast.makeText(this, "Detectado: $objectName", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        vuforiaRenderer.start()
    }

    override fun onPause() {
        super.onPause()
        vuforiaRenderer.stop()
    }
}