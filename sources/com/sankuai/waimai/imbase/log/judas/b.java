package com.sankuai.waimai.imbase.log.judas;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
@SuppressLint({"LogUsage"})
/* loaded from: classes4.dex */
public final class b implements Serializable, Appendable, CharSequence {
    public static ChangeQuickRedirect a;
    @NonNull
    private final StringBuilder b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a<T> {
    }

    @Override // java.lang.Appendable
    public final /* synthetic */ Appendable append(char c) throws IOException {
        Object[] objArr = {Character.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d726ce9086de85717bd758cf6628e5e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d726ce9086de85717bd758cf6628e5e0");
        }
        this.b.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4df89d93b1d2f79958beaf64c09e3c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4df89d93b1d2f79958beaf64c09e3c5");
        }
        this.b.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        Object[] objArr = {charSequence, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "509f67bac0c402621daab7b5a55cc59b", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "509f67bac0c402621daab7b5a55cc59b");
        }
        this.b.append(charSequence, i, i2);
        return this;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0fc9508c6ce7cb9fa9e93299c12f393", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0fc9508c6ce7cb9fa9e93299c12f393");
        } else {
            this.b = new StringBuilder();
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "754ea3fb619525597169957b25372d4b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "754ea3fb619525597169957b25372d4b")).intValue() : this.b.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34f35711bcd76f029c06c06b264b2662", RobustBitConfig.DEFAULT_VALUE) ? ((Character) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34f35711bcd76f029c06c06b264b2662")).charValue() : this.b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37c56a8a2e65968126b17ec511a03969", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37c56a8a2e65968126b17ec511a03969") : this.b.subSequence(i, i2);
    }

    private b a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6140d2d213c8d220075344aca53a9862", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6140d2d213c8d220075344aca53a9862");
        }
        this.b.append(str);
        return this;
    }

    private b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca753bfc0dc8bc19e8c91fe1960f0dbc", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca753bfc0dc8bc19e8c91fe1960f0dbc") : a(StringUtil.NULL);
    }

    public final <K, V> b a(Map<K, V> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd5b9692bcb8c0118733c940aa55da9a", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd5b9692bcb8c0118733c940aa55da9a") : a(map, null, null);
    }

    private <K, V> b a(Map<K, V> map, @Nullable a<K> aVar, @Nullable a<V> aVar2) {
        boolean z = true;
        Object[] objArr = {map, null, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aed86c8b2dfffe4e0770d9129d3404b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aed86c8b2dfffe4e0770d9129d3404b6");
        }
        if (map == null) {
            return a();
        }
        a("[ ");
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                a(" | ");
            }
            a(String.valueOf(entry.getKey()));
            a(" : ");
            a(String.valueOf(entry.getValue()));
        }
        a(" ]");
        return this;
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58db75005b2eab24e2d6a0200b4f149f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58db75005b2eab24e2d6a0200b4f149f") : this.b.toString();
    }
}
