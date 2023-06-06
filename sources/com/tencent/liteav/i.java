package com.tencent.liteav;

import android.graphics.Bitmap;
import com.sankuai.common.utils.shortcut.ShortcutUtils;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.mapsdk.internal.jw;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class i implements Cloneable {
    public int a = 0;
    public int b = 0;
    public int c = 1200;
    public int d = 1500;
    public int e = 800;
    public int f = 5;
    public boolean g = true;
    public int h = 20;
    public int i = 1;
    public int j = 2;
    public com.tencent.liteav.basic.b.c k = com.tencent.liteav.basic.b.c.RESOLUTION_TYPE_540_960;
    public int l = 1;
    public boolean m = true;
    public int n = 3;
    public int o = 0;
    public boolean p = false;
    public int q = 3;
    public int r = 3;
    public int s = 48000;
    public int t = 1;
    public boolean u = true;
    public boolean v = false;
    public boolean w = false;
    public int x = 0;
    public int y = 10;
    public boolean z = false;
    public Bitmap A = null;
    public int B = 300;
    public int C = 10;
    public int D = 1;
    public Bitmap E = null;
    public int F = 0;
    public int G = 0;
    public float H = 0.0f;
    public float I = 0.0f;
    public float J = -1.0f;
    public boolean K = true;
    public boolean L = false;
    public boolean M = false;
    public boolean N = true;
    public int O = 1;
    public boolean P = false;
    public boolean Q = false;
    public int R = 0;
    public boolean S = false;
    public boolean T = true;
    public boolean U = false;
    public boolean V = false;
    public boolean W = false;
    public int X = 0;
    public JSONArray Y = null;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public int a = 0;
        public int b = 0;
    }

    public static a a(com.tencent.liteav.basic.b.c cVar) {
        a aVar = new a();
        switch (cVar) {
            case RESOLUTION_TYPE_360_640:
                aVar.a = 368;
                aVar.b = jw.h;
                break;
            case RESOLUTION_TYPE_540_960:
                aVar.a = KNBJsErrorInfo.CODE_DENIED_PERMISSION;
                aVar.b = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
                break;
            case RESOLUTION_TYPE_720_1280:
                aVar.a = 720;
                aVar.b = 1280;
                break;
            case RESOLUTION_TYPE_320_480:
                aVar.a = jw.e;
                aVar.b = jw.g;
                break;
            case RESOLUTION_TYPE_180_320:
                aVar.a = 192;
                aVar.b = jw.e;
                break;
            case RESOLUTION_TYPE_270_480:
                aVar.a = ShortcutUtils.SHORTCUT_TYPE_ENABLE;
                aVar.b = jw.g;
                break;
            case RESOLUTION_TYPE_240_320:
                aVar.a = 240;
                aVar.b = jw.e;
                break;
            case RESOLUTION_TYPE_360_480:
                aVar.a = 368;
                aVar.b = jw.g;
                break;
            case RESOLUTION_TYPE_480_640:
                aVar.a = jw.g;
                aVar.b = jw.h;
                break;
            case RESOLUTION_TYPE_480_480:
                aVar.a = jw.g;
                aVar.b = jw.g;
                break;
            case RESOLUTION_TYPE_270_270:
                aVar.a = ShortcutUtils.SHORTCUT_TYPE_ENABLE;
                aVar.b = ShortcutUtils.SHORTCUT_TYPE_ENABLE;
                break;
            case RESOLUTION_TYPE_160_160:
                aVar.a = 160;
                aVar.b = 160;
                break;
            case RESOLUTION_TYPE_640_360:
                aVar.a = jw.h;
                aVar.b = 368;
                break;
            case RESOLUTION_TYPE_960_540:
                aVar.a = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
                aVar.b = KNBJsErrorInfo.CODE_DENIED_PERMISSION;
                break;
            case RESOLUTION_TYPE_1280_720:
                aVar.a = 1280;
                aVar.b = 720;
                break;
            case RESOLUTION_TYPE_640_480:
                aVar.a = jw.h;
                aVar.b = jw.g;
                break;
            case RESOLUTION_TYPE_480_360:
                aVar.a = jw.g;
                aVar.b = 368;
                break;
            case RESOLUTION_TYPE_320_240:
                aVar.a = jw.e;
                aVar.b = 240;
                break;
            case RESOLUTION_TYPE_480_270:
                aVar.a = jw.g;
                aVar.b = ShortcutUtils.SHORTCUT_TYPE_ENABLE;
                break;
            case RESOLUTION_TYPE_320_180:
                aVar.a = jw.e;
                aVar.b = 192;
                break;
            case RESOLUTION_TYPE_120_120:
                aVar.a = 128;
                aVar.b = 128;
                break;
            case RESOLUTION_TYPE_1080_1920:
                aVar.a = 1088;
                aVar.b = 1920;
                break;
            case RESOLUTION_TYPE_1920_1080:
                aVar.a = 1920;
                aVar.b = 1088;
                break;
            default:
                aVar.a = 368;
                aVar.b = jw.h;
                break;
        }
        return aVar;
    }

    public boolean a() {
        if (this.k != com.tencent.liteav.basic.b.c.RESOLUTION_TYPE_INVALID) {
            a a2 = a(this.k);
            this.a = a2.a;
            this.b = a2.b;
        }
        return this.a > this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object clone() throws CloneNotSupportedException {
        return (i) super.clone();
    }
}
