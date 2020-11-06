package jp.ac.shohoku.Programmer.k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;


public class CustomView2 extends View {
    public CustomView2(Context context) {
        super(context);
    }

    public CustomView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawColor(Color.BLACK);

        int w = this.getWidth();
        int h = this.getHeight();
        Paint p = new Paint();
        p.setStyle(Style.STROKE);  //Styleを設定：線で描く
        p.setColor(Color.DKGRAY);  //色を設定
        canvas.drawRect(new Rect(5, 5, w - 10, h - 10), p); //長方形を描画
        Resources rs = this.getContext().getResources(); //リソースを取得
        Bitmap bmp = BitmapFactory.decodeResource(rs, R.drawable.inu); //画像を取得
        canvas.drawBitmap(bmp, 0, 0, p); //画像の左上を Canvas の(0,0)に合わせて表示する

        for(int i = 0; i<10; i++){
            Paint p2 = new Paint();
            p2.setStyle(Style.FILL);  //Styleを設定：塗りつぶす
            p2.setColor(Color.rgb(25*i, 0, 0)); //色を設定
            canvas.drawCircle(25*i+125, 25*i+125, 100,p2);  //円を描く

        }
    }
}
