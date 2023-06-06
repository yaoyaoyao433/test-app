package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.tencent.map.tools.Util;
import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class fk implements BitmapDescriptor.BitmapFormator {
    public String f;
    public a g;
    public Bitmap[] h;
    public final Context i;
    private final int k;
    private Bitmap l;
    private String m;
    private int o;
    private int p;
    private int q;
    private ml r;
    private final String j = "marker_default.png";
    public int a = -1;
    public String b = "";
    public String c = "";
    public String d = "";
    public float e = -1.0f;
    private int n = 1;

    private static String a(float f) {
        if (f < 30.0f) {
            return "RED.png";
        }
        if (f < 30.0f || f >= 60.0f) {
            if (f < 60.0f || f >= 120.0f) {
                if (f < 120.0f || f >= 180.0f) {
                    if (f < 180.0f || f >= 210.0f) {
                        if (f < 210.0f || f >= 240.0f) {
                            if (f < 240.0f || f >= 270.0f) {
                                if (f < 270.0f || f >= 300.0f) {
                                    if (f < 300.0f || f >= 330.0f) {
                                        if (f >= 330.0f) {
                                            return "ROSE.png";
                                        }
                                        return null;
                                    }
                                    return "MAGENTAV.png";
                                }
                                return "VIOLET.png";
                            }
                            return "BLUE.png";
                        }
                        return "AZURE.png";
                    }
                    return "CYAN.png";
                }
                return "GREEN.png";
            }
            return "YELLOW.png";
        }
        return "ORANGE.png";
    }

    public fk(Context context, int i) {
        this.i = context;
        this.k = i;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator
    public final String getBitmapId() {
        Bitmap bitmap;
        String str;
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(this.m) || this.k == 10) {
            switch (this.k) {
                case 1:
                    this.m = "res_" + this.a;
                    break;
                case 2:
                    this.m = "asset_" + this.b;
                    break;
                case 3:
                    this.m = "file_" + this.c;
                    break;
                case 4:
                    this.m = "path_" + this.d;
                    break;
                case 5:
                    this.m = "asset_marker_default.png";
                    break;
                case 6:
                    String a2 = a(this.e);
                    if (a2 != null) {
                        this.m = "asset_".concat(String.valueOf(a2));
                        break;
                    }
                    break;
                case 7:
                    if (this.l != null && !this.l.isRecycled()) {
                        this.m = "bitmap_" + gx.a(this.l);
                        break;
                    }
                    break;
                case 8:
                    if (!TextUtils.isEmpty(this.f)) {
                        this.m = "url_" + Util.getMD5String(this.f);
                        break;
                    }
                    break;
                case 9:
                    if (this.g != null) {
                        this.m = "fonttext_" + Util.getMD5String(this.g.toString());
                        break;
                    }
                    break;
                case 10:
                    if (this.h != null && this.h.length > this.q && this.q >= 0 && (bitmap = this.h[this.q]) != null && !bitmap.isRecycled()) {
                        this.m = "bitmaps_" + gx.a(bitmap);
                        break;
                    }
                    break;
            }
        }
        sb.append(this.m);
        if (this.n <= 1) {
            str = "";
        } else {
            str = "@" + this.n + Constants.GestureMoveEvent.KEY_X;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator
    public final int getWidth() {
        getBitmap(this.i);
        return this.o;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator
    public final int getHeight() {
        getBitmap(this.i);
        return this.p;
    }

    private String a() {
        if (this.n <= 1) {
            return "";
        }
        return "@" + this.n + Constants.GestureMoveEvent.KEY_X;
    }

    private static String b(Bitmap bitmap) {
        return gx.a(bitmap);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator
    public final Bitmap getBitmap(Context context) {
        if (this.l == null || this.m == null || this.k == 10) {
            Bitmap bitmap = null;
            if (context == null) {
                return null;
            }
            Bitmap a2 = gx.b != null ? gx.b.a(getBitmapId()) : null;
            if (a2 == null) {
                switch (this.k) {
                    case 1:
                        bitmap = gx.a(context, this.a);
                        break;
                    case 2:
                        bitmap = gx.c(context, this.b);
                        if (bitmap == null && (bitmap = gx.b(context, this.b)) != null && !this.b.equals(fq.i)) {
                            bitmap = gx.b(bitmap);
                            break;
                        }
                        break;
                    case 3:
                        bitmap = gx.a(context, this.c);
                        break;
                    case 4:
                        bitmap = gx.a(this.d);
                        break;
                    case 5:
                        bitmap = gx.b(context, "marker_default.png");
                        break;
                    case 6:
                        String a3 = a(this.e);
                        if (a3 != null) {
                            bitmap = gx.b(context, a3);
                            break;
                        }
                        break;
                    case 7:
                        bitmap = this.l;
                        break;
                    case 8:
                        if (!TextUtils.isEmpty(this.f)) {
                            bitmap = a(this.f);
                            break;
                        }
                        break;
                    case 9:
                        if (this.g != null) {
                            a aVar = this.g;
                            if (this.r == null) {
                                this.r = new ml(context);
                            }
                            ml mlVar = this.r;
                            mlVar.setText(aVar.a);
                            mlVar.setTextSize(0, aVar.b * aVar.g);
                            mlVar.setTextColor(aVar.c);
                            mlVar.setStrokeColor(aVar.e);
                            mlVar.setStrokeWidth(aVar.d * aVar.g);
                            mlVar.setTypeface(aVar.f);
                            bitmap = gx.a(mlVar);
                            break;
                        }
                        break;
                    case 10:
                        if (this.h != null && this.h.length > this.q && this.q >= 0) {
                            bitmap = this.h[this.q];
                            break;
                        }
                        break;
                }
                a2 = bitmap;
                if (gx.b != null && a2 != null) {
                    gx.b.a(getBitmapId(), a2);
                }
            }
            if (a2 != null) {
                this.o = a2.getWidth();
                this.p = a2.getHeight();
                this.l = a2;
            }
            return a2;
        }
        return this.l;
    }

    private String b() {
        Bitmap bitmap;
        if (!TextUtils.isEmpty(this.m) && this.k != 10) {
            return this.m;
        }
        switch (this.k) {
            case 1:
                this.m = "res_" + this.a;
                break;
            case 2:
                this.m = "asset_" + this.b;
                break;
            case 3:
                this.m = "file_" + this.c;
                break;
            case 4:
                this.m = "path_" + this.d;
                break;
            case 5:
                this.m = "asset_marker_default.png";
                break;
            case 6:
                String a2 = a(this.e);
                if (a2 != null) {
                    this.m = "asset_".concat(String.valueOf(a2));
                    break;
                }
                break;
            case 7:
                if (this.l != null && !this.l.isRecycled()) {
                    this.m = "bitmap_" + gx.a(this.l);
                    break;
                }
                break;
            case 8:
                if (!TextUtils.isEmpty(this.f)) {
                    this.m = "url_" + Util.getMD5String(this.f);
                    break;
                }
                break;
            case 9:
                if (this.g != null) {
                    this.m = "fonttext_" + Util.getMD5String(this.g.toString());
                    break;
                }
                break;
            case 10:
                if (this.h != null && this.h.length > this.q && this.q >= 0 && (bitmap = this.h[this.q]) != null && !bitmap.isRecycled()) {
                    this.m = "bitmaps_" + gx.a(bitmap);
                    break;
                }
                break;
        }
        return this.m;
    }

    private Bitmap a(Context context, int i) {
        switch (i) {
            case 1:
                return gx.a(context, this.a);
            case 2:
                Bitmap c = gx.c(context, this.b);
                if (c == null) {
                    Bitmap b = gx.b(context, this.b);
                    return (b == null || this.b.equals(fq.i)) ? b : gx.b(b);
                }
                return c;
            case 3:
                return gx.a(context, this.c);
            case 4:
                return gx.a(this.d);
            case 5:
                return gx.b(context, "marker_default.png");
            case 6:
                String a2 = a(this.e);
                if (a2 != null) {
                    return gx.b(context, a2);
                }
                break;
            case 7:
                return this.l;
            case 8:
                if (!TextUtils.isEmpty(this.f)) {
                    return a(this.f);
                }
                break;
            case 9:
                if (this.g != null) {
                    a aVar = this.g;
                    if (this.r == null) {
                        this.r = new ml(context);
                    }
                    ml mlVar = this.r;
                    mlVar.setText(aVar.a);
                    mlVar.setTextSize(0, aVar.b * aVar.g);
                    mlVar.setTextColor(aVar.c);
                    mlVar.setStrokeColor(aVar.e);
                    mlVar.setStrokeWidth(aVar.d * aVar.g);
                    mlVar.setTypeface(aVar.f);
                    return gx.a(mlVar);
                }
                break;
            case 10:
                if (this.h != null && this.h.length > this.q && this.q >= 0) {
                    return this.h[this.q];
                }
                break;
        }
        return null;
    }

    private Bitmap a(Context context, a aVar) {
        if (this.r == null) {
            this.r = new ml(context);
        }
        ml mlVar = this.r;
        mlVar.setText(aVar.a);
        mlVar.setTextSize(0, aVar.b * aVar.g);
        mlVar.setTextColor(aVar.c);
        mlVar.setStrokeColor(aVar.e);
        mlVar.setStrokeWidth(aVar.d * aVar.g);
        mlVar.setTypeface(aVar.f);
        return gx.a(mlVar);
    }

    private static Bitmap a(String str) {
        NetResponse doGet = NetManager.getInstance().builder().url(str).doGet();
        if (doGet != null && doGet.available()) {
            try {
                return com.sankuai.waimai.launcher.util.image.a.a(doGet.data, 0, doGet.data.length);
            } catch (OutOfMemoryError unused) {
                System.gc();
                try {
                    return com.sankuai.waimai.launcher.util.image.a.a(doGet.data, 0, doGet.data.length);
                } catch (OutOfMemoryError unused2) {
                }
            }
        }
        return null;
    }

    private BitmapDescriptor.BitmapFormator a(int i) {
        this.a = i;
        return this;
    }

    private BitmapDescriptor.BitmapFormator b(String str) {
        this.b = str;
        return this;
    }

    private BitmapDescriptor.BitmapFormator c(String str) {
        this.c = str;
        return this;
    }

    private BitmapDescriptor.BitmapFormator d(String str) {
        this.d = str;
        return this;
    }

    private BitmapDescriptor.BitmapFormator b(float f) {
        this.e = f;
        return this;
    }

    public final BitmapDescriptor.BitmapFormator a(Bitmap bitmap) {
        this.l = bitmap;
        getBitmap(this.i);
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator
    public final int getFormateType() {
        return this.k;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator
    public final void setScale(int i) {
        this.n = i;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator
    public final int nextActiveIndex() {
        if (this.h != null && this.h.length > 1) {
            int i = this.q + 1;
            this.q = i;
            this.q = i % this.h.length;
        } else {
            this.q = 0;
        }
        return this.q;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator
    public final int activeSize() {
        if (this.h != null) {
            return this.h.length;
        }
        return this.l != null ? 1 : 0;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator
    public final void recycle() {
        kj.b(ki.r, "remove on format recycle");
        if (gx.b.b(getBitmapId())) {
            kd.a(this.h);
            kd.a(this.l);
        }
    }

    private BitmapDescriptor.BitmapFormator e(String str) {
        this.f = str;
        return this;
    }

    private BitmapDescriptor.BitmapFormator a(a aVar) {
        this.g = aVar;
        return this;
    }

    private void a(Bitmap[] bitmapArr) {
        this.h = bitmapArr;
        getBitmap(this.i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.tencent.mapsdk.internal.fk.a.1
            private static a a(Parcel parcel) {
                return new a(parcel);
            }

            private static a[] a(int i) {
                return new a[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ a[] newArray(int i) {
                return new a[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }
        };
        String a;
        int b;
        int c;
        public float d;
        public int e;
        public Typeface f;
        public float g;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public a(String str, int i, int i2) {
            this.g = 1.0f;
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        protected a(Parcel parcel) {
            this.g = 1.0f;
            this.a = parcel.readString();
            this.b = parcel.readInt();
            this.c = parcel.readInt();
            this.d = parcel.readFloat();
            this.e = parcel.readInt();
            this.g = parcel.readFloat();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeFloat(this.d);
            parcel.writeInt(this.e);
            parcel.writeFloat(this.g);
        }

        private float a() {
            return this.g;
        }

        private void a(float f) {
            this.g = f;
        }

        private float b() {
            return this.d;
        }

        private void b(float f) {
            this.d = f;
        }

        private int c() {
            return this.e;
        }

        private void a(int i) {
            this.e = i;
        }

        private void a(Typeface typeface) {
            this.f = typeface;
        }

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer("FontText{");
            stringBuffer.append("text='");
            stringBuffer.append(this.a);
            stringBuffer.append('\'');
            stringBuffer.append(", textSize=");
            stringBuffer.append(this.b);
            stringBuffer.append(", textColor=");
            stringBuffer.append(this.c);
            stringBuffer.append(", strokeWith=");
            stringBuffer.append(this.d);
            stringBuffer.append(", strokeColor=");
            stringBuffer.append(this.e);
            stringBuffer.append(", typeface=");
            stringBuffer.append(this.f);
            stringBuffer.append(", scale=");
            stringBuffer.append(this.g);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }
}
