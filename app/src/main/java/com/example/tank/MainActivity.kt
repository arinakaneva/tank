package com.example.tank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.KeyEvent.KEYCODE_DPAD_DOWN
import android.view.KeyEvent.KEYCODE_DPAD_LEFT
import android.view.KeyEvent.KEYCODE_DPAD_RIGHT
import android.view.KeyEvent.KEYCODE_DPAD_UP
import com.example.tank.Direction.UP
import com.example.tank.Direction.DOWN
import com.example.tank.Direction.LEFT
import com.example.tank.Direction.RIGHT

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when (keyCode){
            KEYCODE_DPAD_UP -> move(UP)
            KEYCODE_DPAD_DOWN -> move(DOWN)
            KEYCODE_DPAD_LEFT -> move(LEFT)
            KEYCODE_DPAD_RIGHT -> move(RIGHT)
        }
        return super.onKeyDown(keyCode, event)
    }
    private fun move(direction: Direction){
        when(direction){
            UP->{

            }
            DOWN->{

            }
            LEFT->{

            }
            RIGHT->{
                
            }
        }
    }
}