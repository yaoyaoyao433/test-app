package com.meituan.android.loader.impl.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.loader.impl.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LoadStatusProvider extends ContentProvider {
    public static ChangeQuickRedirect a;
    public static Map<String, Boolean> b = new ConcurrentHashMap();

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47b66623832aea587fe83b0b8b894d9c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47b66623832aea587fe83b0b8b894d9c")).booleanValue();
        }
        Context context = getContext();
        return context != null && ProcessUtils.isMainProcess(context);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        Object[] objArr = {uri, strArr, str, strArr2, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "698086b65fa6f8b49570f2506c3c8c9c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Cursor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "698086b65fa6f8b49570f2506c3c8c9c");
        }
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce7d0622995a5452dfc6ed9e74593375", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce7d0622995a5452dfc6ed9e74593375");
        }
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        Object[] objArr = {uri, contentValues};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "434124fdaed89185e8810f84f00003ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "434124fdaed89185e8810f84f00003ff");
        }
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        Object[] objArr = {uri, str, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "080982dffdf399beea999296fda470f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "080982dffdf399beea999296fda470f8")).intValue();
        }
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        Object[] objArr = {uri, contentValues, str, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c07bb60d464a38ca9b35b962a6155711", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c07bb60d464a38ca9b35b962a6155711")).intValue();
        }
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        boolean z = false;
        Object[] objArr = {str, str2, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d76f59d83273b3b5d19402c15d02071", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d76f59d83273b3b5d19402c15d02071");
        }
        f.d(">>>DynLoader LoadStatusProvider ---call---, time=" + System.nanoTime() + ", arg:" + str2 + ", extras:" + bundle + ", method:" + str);
        Bundle bundle2 = null;
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 478705154) {
            if (hashCode == 1389457678 && str.equals("set_load_status")) {
                c = 1;
            }
        } else if (str.equals("get_load_status")) {
            c = 0;
        }
        switch (c) {
            case 0:
                bundle2 = new Bundle();
                f.d(">>>DynLoader LoadStatusProvider METHOD_GET_LOAD_STATUS other process, time=" + System.nanoTime() + ", arg:" + str2 + ", extras:" + bundle + ", sLoadStatusMap.get(arg)=" + b.get(str2));
                if (!TextUtils.isEmpty(str2) && b.get(str2) != null) {
                    z = b.get(str2).booleanValue();
                }
                bundle2.putBoolean("load_status", z);
                break;
            case 1:
                f.d(">>>DynLoader LoadStatusProvider METHOD_SET_LOAD_STATUS other process, time=" + System.nanoTime() + ", arg:" + str2 + ", extras:" + bundle);
                if (bundle != null) {
                    String string = bundle.getString("so_name", "");
                    boolean z2 = bundle.getBoolean("load_status", false);
                    f.d(">>>DynLoader LoadStatusProvider METHOD_SET_LOAD_STATUS other process, time=" + System.nanoTime() + ", arg:" + str2 + ", extras:" + bundle + ", soName:" + string + ", loadStatus:" + z2);
                    if (!TextUtils.isEmpty(string)) {
                        b.put(string, Boolean.valueOf(z2));
                        break;
                    }
                }
                break;
        }
        return bundle2;
    }
}
