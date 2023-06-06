package com.sankuai.waimai.foundation.utils.log;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
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

    @Override // java.lang.Appendable
    public final /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "054db85bcdf933f07d7192082a7f331c", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "054db85bcdf933f07d7192082a7f331c");
        }
        this.b.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        Object[] objArr = {charSequence, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deb092376d05ff1086e5f0a8e1f15535", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deb092376d05ff1086e5f0a8e1f15535");
        }
        this.b.append(charSequence, i, i2);
        return this;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6e571ed9d111b90d64dde981cd1fe52", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6e571ed9d111b90d64dde981cd1fe52");
        } else {
            this.b = new StringBuilder();
        }
    }

    public b(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97bd82c3369dfb6c70d84d81fdee8c04", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97bd82c3369dfb6c70d84d81fdee8c04");
        } else {
            this.b = new StringBuilder(str == null ? "" : str);
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3f1ce7765d3cdfc482abe7563bec1e1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3f1ce7765d3cdfc482abe7563bec1e1")).intValue() : this.b.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49fb4d2e3fffd3ceefe87da3edc3c46a", RobustBitConfig.DEFAULT_VALUE) ? ((Character) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49fb4d2e3fffd3ceefe87da3edc3c46a")).charValue() : this.b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74ef613fa792207fec318c63c1e9fae0", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74ef613fa792207fec318c63c1e9fae0") : this.b.subSequence(i, i2);
    }

    @Override // java.lang.Appendable
    /* renamed from: a */
    public final b append(char c) {
        Object[] objArr = {Character.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f9c9f52c84fedbc4aa26f2916da4662", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f9c9f52c84fedbc4aa26f2916da4662");
        }
        this.b.append(c);
        return this;
    }

    public final b a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d68f9874260e2393b7db3984b6da0d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d68f9874260e2393b7db3984b6da0d0");
        }
        this.b.append(str);
        return this;
    }

    private b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64decdd961b2c738667f4992c3d324ba", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64decdd961b2c738667f4992c3d324ba") : a(StringUtil.NULL);
    }

    public final <K, V> b a(Map<K, V> map) {
        boolean z = true;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "040f4bb8f72e13fb3e7005f8b160f580", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "040f4bb8f72e13fb3e7005f8b160f580");
        }
        Object[] objArr2 = {map, null, null};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aac50743274568bb7ccdee0a7b6d4f6f", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aac50743274568bb7ccdee0a7b6d4f6f");
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

    public final b a(Context context, @IdRes int i) {
        Resources resources;
        String str;
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbda699057e1063d4fb43e067cbc1722", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbda699057e1063d4fb43e067cbc1722");
        }
        if (context != null) {
            if (((i >>> 24) != 0) && (resources = context.getResources()) != null) {
                int i2 = (-16777216) & i;
                if (i2 == 16777216) {
                    str = "android";
                } else if (i2 != 2130706432) {
                    try {
                        str = resources.getResourcePackageName(i);
                    } catch (Resources.NotFoundException unused) {
                    }
                } else {
                    str = "app";
                }
                a(str);
                a(CommonConstant.Symbol.COLON);
                a(resources.getResourceTypeName(i));
                a("/");
                a(resources.getResourceEntryName(i));
                return this;
            }
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "89d71c2b32c53a220106a866aaaa1a12", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "89d71c2b32c53a220106a866aaaa1a12");
        }
        this.b.append(i);
        return this;
    }

    public final b a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba3248c928c0740f0bbd4821763c3ae5", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba3248c928c0740f0bbd4821763c3ae5");
        }
        if (view == null) {
            return a();
        }
        a("[ ");
        a(view.getClass().getSimpleName());
        a(" | ");
        a(view.getContext(), view.getId());
        a(" ]");
        return this;
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba99301500e50de8c379b224a3526f59", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba99301500e50de8c379b224a3526f59") : this.b.toString();
    }
}
