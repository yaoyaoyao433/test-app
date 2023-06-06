package com.dianping.video.util;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class FilterManager {
    public static ChangeQuickRedirect a;
    private static FilterManager c;
    private final ArrayList<FilterModel> b;

    public static FilterManager a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99882b04b5fa94ade6204fa0eb342a9f", RobustBitConfig.DEFAULT_VALUE)) {
            return (FilterManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99882b04b5fa94ade6204fa0eb342a9f");
        }
        if (c == null) {
            synchronized (FilterManager.class) {
                if (c == null) {
                    c = new FilterManager();
                }
            }
        }
        return c;
    }

    public FilterManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f809c15cc691d7c973293e121de94566", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f809c15cc691d7c973293e121de94566");
        } else {
            this.b = new ArrayList<>();
        }
    }

    public final FilterModel a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1f6f0d867cc98133ae8db4faace187f", RobustBitConfig.DEFAULT_VALUE)) {
            return (FilterModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1f6f0d867cc98133ae8db4faace187f");
        }
        Iterator<FilterModel> it = this.b.iterator();
        while (it.hasNext()) {
            FilterModel next = it.next();
            if (next.d.equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class FilterModel implements Parcelable {
        public static final Parcelable.Creator<FilterModel> CREATOR = new Parcelable.Creator<FilterModel>() { // from class: com.dianping.video.util.FilterManager.FilterModel.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ FilterModel createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d3c011884ac8b256e643f2ab8962bc5", RobustBitConfig.DEFAULT_VALUE) ? (FilterModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d3c011884ac8b256e643f2ab8962bc5") : new FilterModel(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ FilterModel[] newArray(int i) {
                return new FilterModel[i];
            }
        };
        public static ChangeQuickRedirect a;
        public int b;
        public Bitmap c;
        public String d;
        public String e;
        public String f;
        public boolean g;
        public String h;
        public String i;
        public float j;
        public String k;
        public String l;
        public int m;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public FilterModel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66bda429f9241aeae51e395c21829f17", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66bda429f9241aeae51e395c21829f17");
                return;
            }
            this.c = null;
            this.j = 1.0f;
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readString();
            this.h = parcel.readString();
            this.i = parcel.readString();
            this.g = parcel.readByte() != 0;
            this.j = parcel.readFloat();
            this.b = parcel.readInt();
            this.k = parcel.readString();
            this.l = parcel.readString();
            this.m = parcel.readInt();
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final android.graphics.Bitmap a(android.content.Context r13) {
            /*
                r12 = this;
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r8 = 0
                r0[r8] = r13
                com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.video.util.FilterManager.FilterModel.a
                java.lang.String r10 = "a02977c93833c7bfd1e66c73ececaf44"
                r4 = 0
                r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                r1 = r0
                r2 = r12
                r3 = r9
                r5 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                if (r1 == 0) goto L1e
                java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r9, r8, r10)
                android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
                return r13
            L1e:
                r0 = 0
                java.lang.String r1 = r12.h     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
                if (r1 == 0) goto L36
                boolean r1 = r12.g     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
                if (r1 == 0) goto L36
                android.content.res.Resources r13 = r13.getResources()     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
                android.content.res.AssetManager r13 = r13.getAssets()     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
                java.lang.String r1 = r12.h     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
                java.io.InputStream r13 = r13.open(r1)     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
                goto L47
            L36:
                java.lang.String r13 = r12.i     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
                if (r13 == 0) goto L46
                boolean r13 = r12.g     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
                if (r13 != 0) goto L46
                java.io.FileInputStream r13 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
                java.lang.String r1 = r12.i     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
                r13.<init>(r1)     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
                goto L47
            L46:
                r13 = r0
            L47:
                if (r13 == 0) goto L62
                android.graphics.Bitmap r1 = com.sankuai.waimai.launcher.util.image.a.a(r13)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5d
                if (r13 == 0) goto L57
                r13.close()     // Catch: java.io.IOException -> L53
                goto L57
            L53:
                r13 = move-exception
                r13.printStackTrace()
            L57:
                return r1
            L58:
                r0 = move-exception
                r11 = r0
                r0 = r13
                r13 = r11
                goto L7c
            L5d:
                r1 = move-exception
                r11 = r1
                r1 = r13
                r13 = r11
                goto L6c
            L62:
                if (r13 == 0) goto L79
                r13.close()     // Catch: java.io.IOException -> L75
                goto L79
            L68:
                r13 = move-exception
                goto L7c
            L6a:
                r13 = move-exception
                r1 = r0
            L6c:
                r13.printStackTrace()     // Catch: java.lang.Throwable -> L7a
                if (r1 == 0) goto L79
                r1.close()     // Catch: java.io.IOException -> L75
                goto L79
            L75:
                r13 = move-exception
                r13.printStackTrace()
            L79:
                return r0
            L7a:
                r13 = move-exception
                r0 = r1
            L7c:
                if (r0 == 0) goto L86
                r0.close()     // Catch: java.io.IOException -> L82
                goto L86
            L82:
                r0 = move-exception
                r0.printStackTrace()
            L86:
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.video.util.FilterManager.FilterModel.a(android.content.Context):android.graphics.Bitmap");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a72077fe803a80b6a6d7be704b81349a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a72077fe803a80b6a6d7be704b81349a");
                return;
            }
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
            parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
            parcel.writeFloat(this.j);
            parcel.writeInt(100);
            parcel.writeString(this.k);
            parcel.writeString(this.l);
            parcel.writeInt(this.m);
        }
    }
}
