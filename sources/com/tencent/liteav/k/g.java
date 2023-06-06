package com.tencent.liteav.k;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.b.ak;
import com.tencent.liteav.beauty.b.t;
import com.tencent.liteav.k.n;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class g {
    private Context c;
    private ak a = null;
    private t b = null;
    private String d = "Lighting";
    private n.h e = null;

    public g(Context context) {
        this.c = null;
        this.c = context;
    }

    public boolean a(int i, int i2) {
        return c(i, i2);
    }

    private boolean c(int i, int i2) {
        Bitmap bitmap;
        if (this.c == null) {
            TXCLog.e(this.d, "mContext is null!");
            return false;
        }
        AssetManager assets = this.c.getResources().getAssets();
        Bitmap bitmap2 = null;
        try {
            bitmap2 = com.sankuai.waimai.launcher.util.image.a.a(assets.open("fennen.png"));
        } catch (IOException e) {
            TXCLog.e(this.d, "decode stream failed.", e);
        }
        if (this.a == null) {
            this.a = new ak(bitmap2);
            this.a.a(true);
            if (!this.a.c()) {
                TXCLog.e(this.d, "mLoopupInvertFilter init error!");
                return false;
            }
        }
        this.a.a(i, i2);
        try {
            bitmap = com.sankuai.waimai.launcher.util.image.a.a(assets.open("qingliang.png"));
        } catch (IOException e2) {
            TXCLog.e(this.d, "decode stream failed.", e2);
            bitmap = bitmap2;
        }
        if (this.b == null) {
            this.b = new t(bitmap);
            this.b.a(true);
            if (!this.b.c()) {
                TXCLog.e(this.d, "mLoopupFilter init error!");
                return false;
            }
        }
        this.b.a(i, i2);
        return true;
    }

    public void a() {
        if (this.a != null) {
            this.a.e();
            this.a = null;
        }
        if (this.b != null) {
            this.b.e();
            this.b = null;
        }
    }

    public void b(int i, int i2) {
        c(i, i2);
    }

    public void a(n.h hVar) {
        this.e = hVar;
        if (this.e != null) {
            if (this.a != null) {
                this.a.a(this.e.a / 5.0f);
                this.a.b(this.e.a * 1.5f);
            }
            if (this.b != null) {
                this.b.a(this.e.a / 5.0f);
            }
        }
    }

    public int a(int i) {
        if (this.e == null || this.e.a <= 0.0f) {
            return i;
        }
        if (this.a != null) {
            i = this.a.a(i);
        }
        return this.b != null ? this.b.a(i) : i;
    }

    public void b() {
        a();
    }
}
