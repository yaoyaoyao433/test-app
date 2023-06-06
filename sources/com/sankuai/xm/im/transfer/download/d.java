package com.sankuai.xm.im.transfer.download;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.MediaMessage;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d implements Comparable<d> {
    public static ChangeQuickRedirect a;
    MediaMessage b;
    int c;
    int d;
    int e;
    long f;
    String g;
    String h;
    boolean i;
    String j;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull d dVar) {
        return 0;
    }

    public d(String str, String str2, int i, boolean z, String str3) {
        this(null, str, str2, 1, i, z, str3);
        Object[] objArr = {str, str2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dff68d85bc1488d378e556022953b71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dff68d85bc1488d378e556022953b71");
        }
    }

    public d(MediaMessage mediaMessage, String str, String str2, int i) {
        this(mediaMessage, str, str2, 1, i, true, mediaMessage == null ? null : mediaMessage.getToken());
        Object[] objArr = {mediaMessage, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efd886b89057ecb4b61b3c3c0d34b580", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efd886b89057ecb4b61b3c3c0d34b580");
        }
    }

    public d(MediaMessage mediaMessage, String str, String str2, int i, int i2, boolean z, String str3) {
        String token;
        Object[] objArr = {mediaMessage, str, str2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9f2969343deb5feed83d70529c65edd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9f2969343deb5feed83d70529c65edd");
            return;
        }
        this.b = mediaMessage;
        this.e = i;
        this.h = str2 == null ? "" : str2;
        this.g = str == null ? "" : str;
        this.d = 0;
        this.c = i2;
        this.i = z;
        if (mediaMessage == null) {
            this.f = System.currentTimeMillis();
        } else {
            this.f = mediaMessage.getSts();
            if (TextUtils.isEmpty(str3)) {
                token = mediaMessage.getToken();
                this.j = token;
            }
        }
        token = str3;
        this.j = token;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a4ed148b34b678e5fedde7b3bfe0886", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a4ed148b34b678e5fedde7b3bfe0886")).booleanValue();
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return TextUtils.equals(this.g, dVar.g) && TextUtils.equals(this.h, dVar.h);
        }
        return false;
    }
}
