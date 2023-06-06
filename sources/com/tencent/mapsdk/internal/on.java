package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class on extends oo implements id {
    public static final int E = 0;
    public static final int F = 1;
    public static final int G = 2;
    public static final int I = 1;
    public static final int J = 2;
    public static final int K = 3;
    public static final int L = 4;
    public int H;
    protected float M = 1.0f;
    protected float N = 1.0f;
    protected float O = 1.0f;
    protected float P = 0.0f;
    protected float Q = 0.0f;
    protected float R = 0.0f;
    private a a;
    private b b;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        boolean b();

        String c();

        Bitmap d();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
        void a();
    }

    public final synchronized void a(a aVar) {
        this.a = aVar;
    }

    public void b(int i) {
        this.H = i;
        this.M = 1.0f;
        this.N = 1.0f;
        this.O = 1.0f;
        this.P = 0.0f;
        this.Q = 0.0f;
    }

    private int a() {
        return this.H;
    }

    @Override // com.tencent.mapsdk.internal.id
    public final void a(int i, Object obj) {
        switch (i) {
            case 1:
                this.M = ((Number) obj).floatValue();
                return;
            case 2:
                fm fmVar = (fm) obj;
                this.N = (float) fmVar.a;
                this.O = (float) fmVar.b;
                return;
            case 3:
                fm fmVar2 = (fm) obj;
                this.P = (float) fmVar2.a;
                this.Q = (float) fmVar2.b;
                return;
            case 4:
                this.R = ((Number) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
