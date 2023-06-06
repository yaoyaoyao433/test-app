package com.meituan.passport.converter;

import android.graphics.Bitmap;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.passport.pojo.BaseResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.i;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends i.a {
    public static ChangeQuickRedirect a;
    private final Gson b;

    public d(Gson gson) {
        Object[] objArr = {gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72ecbf6bbc769916453d545721d60a0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72ecbf6bbc769916453d545721d60a0e");
        } else if (gson == null) {
            throw new NullPointerException("gson == null");
        } else {
            this.b = gson;
        }
    }

    @Override // com.sankuai.meituan.retrofit2.i.a
    public final com.sankuai.meituan.retrofit2.i<ap, ?> a(Type type, Annotation[] annotationArr, ar arVar) {
        TypeAdapter typeAdapter;
        TypeAdapter typeAdapter2;
        Object[] objArr = {type, annotationArr, arVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "480836f6c519adc412974a742c23f3af", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "480836f6c519adc412974a742c23f3af");
        }
        if (type == Bitmap.class) {
            return new c();
        }
        if (C$Gson$Types.getRawType(type) == BaseResult.class) {
            try {
                typeAdapter = this.b.getAdapter(TypeToken.get(type));
            } catch (Exception e) {
                HashMap hashMap = new HashMap();
                hashMap.put("type_token", TypeToken.get(type).toString());
                StringWriter stringWriter = new StringWriter();
                e.printStackTrace(new PrintWriter(stringWriter));
                Sniffer.smell("passport", "passport_exception", "unknown_exception", "PassportGsonConvertFactory.responseBodyConverter.BaseResult", stringWriter.toString(), hashMap);
                typeAdapter = null;
            }
            return new f(this.b, typeAdapter, type);
        }
        try {
            typeAdapter2 = this.b.getAdapter(TypeToken.get(type));
        } catch (Exception e2) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("type_token", TypeToken.get(type).toString());
            StringWriter stringWriter2 = new StringWriter();
            e2.printStackTrace(new PrintWriter(stringWriter2));
            Sniffer.smell("passport", "passport_exception", "unknown_exception", "PassportGsonConvertFactory.responseBodyConverter.BaseResult", stringWriter2.toString(), hashMap2);
            typeAdapter2 = null;
        }
        return new g(this.b, typeAdapter2, type);
    }

    @Override // com.sankuai.meituan.retrofit2.i.a
    public final com.sankuai.meituan.retrofit2.i<?, ak> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, ar arVar) {
        Object[] objArr = {type, annotationArr, annotationArr2, arVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80f2581ef9a33d9eb3b3f9527389dcdd", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.retrofit2.i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80f2581ef9a33d9eb3b3f9527389dcdd") : new e(this.b, this.b.getAdapter(TypeToken.get(type)));
    }
}
