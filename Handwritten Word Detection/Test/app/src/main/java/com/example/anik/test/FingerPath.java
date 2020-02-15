package com.example.anik.test;

/**
 * Created by Anik on 30-Nov-17.
 */
import android.graphics.Path;
public class FingerPath {
    public int color;
    public boolean emboss;
    public boolean blur;
    public int strokeWidth;
    public Path path;
    public FingerPath(int color, boolean emboss, boolean blur, int strokeWidth, Path path){
        this.color=color;
        this.emboss=emboss;
        this.blur=blur;
        this.path=path;
    }
}
