package jp.ac.shohoku.Programmer.k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class PictureView extends View {
    public PictureView(Context context) {
        super(context);
    }

    public PictureView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     28 * 描画するメソッド
     29 */
 @Override
 protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE); //キャンバスの背景を白にする

        int w = this.getWidth(); //View の幅を取得
        int h = this.getHeight(); //View の高さを取得
        Paint p = new Paint(); //描画する図形の属性
         p.setStyle(Paint.Style.STROKE); //線のみ
         p.setColor(Color.BLUE); //
         canvas.drawRect(new Rect(5,5,w-10,h-10),p); //長方形を canvas に描く
         Resources rs = this.getContext().getResources(); //リソースを取得
         Bitmap bmp = BitmapFactory.decodeResource(rs, R.drawable.inu); //画像を取得
         canvas.drawBitmap(bmp, 0, 0, p); //画像の左上を Canvas の(0,0)に合わせて表示する
         }



    public PictureView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}

