package com.example.myapplication11;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class AnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        final ImageView imageView = findViewById(R.id.imageView);

        // Создание объекта анимации вращения
        ObjectAnimator rotationAnimator = ObjectAnimator.ofFloat(imageView, "rotation", 0f, 360f);
        rotationAnimator.setDuration(2000); // Установка продолжительности анимации в миллисекундах
        rotationAnimator.setInterpolator(new LinearInterpolator()); // Установка интерполятора (линейный интерполятор)

        // Запуск анимации
        rotationAnimator.start();
    }
}
