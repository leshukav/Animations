package ru.netology.statsview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import ru.netology.statsview.ui.StatsView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = findViewById<StatsView>(R.id.statsView)
        view.data = listOf(
            10F,
            10F,
            10F,
            10F,
        )
        /*    view.startAnimation(
                AnimationUtils.loadAnimation(this, R.anim.animation)
            )
             val rotation =  PropertyValuesHolder.ofFloat(View.TRANSLATION_X, 0F,60F)
              val alpha = PropertyValuesHolder.ofFloat(View.ALPHA,0F,1F)
              ObjectAnimator.ofPropertyValuesHolder(view,rotation,alpha)
                  .apply {
                      startDelay = 5000
                      duration = 1000
                      interpolator = LinearInterpolator()
                  }.start()


              val alpha = ObjectAnimator.ofFloat(view, View.ALPHA, 0.25F , 1F).apply {
                  duration = 5000
                  interpolator = LinearInterpolator()
              }
              val scaleX = PropertyValuesHolder.ofFloat(View.SCALE_X, 0F, 1F)
              val scaleY = PropertyValuesHolder.ofFloat(View.SCALE_Y, 0F, 1F)
              val scale = ObjectAnimator.ofPropertyValuesHolder(view,scaleX,scaleY).apply {
                  duration = 500
                  interpolator = BounceInterpolator()
              }
              AnimatorSet().apply {
                  startDelay = 400
                  playSequentially(scale,alpha)
              }.start()

          */
    }
}