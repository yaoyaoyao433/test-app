package com.meituan.android.recce;

import android.content.Context;
import android.support.annotation.NonNull;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.recce.bridge.RecceCustomApi;
import com.meituan.android.recce.exception.RecceExceptionHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public Context b;
    List<ReccePackage> c;
    public String d;
    public RecceExceptionHandler e;
    public Object f;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c205c551af158ba37544e65684c791de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c205c551af158ba37544e65684c791de");
        } else {
            this.c = new ArrayList();
        }
    }

    public final g a(ReccePackage reccePackage) {
        Object[] objArr = {reccePackage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a5865ecad2ae99a88c2250fd9e9a585", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a5865ecad2ae99a88c2250fd9e9a585");
        }
        this.c.add(reccePackage);
        return this;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a implements ReccePackage {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {g.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d98739f4b6588e505589131d12cf988f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d98739f4b6588e505589131d12cf988f");
            }
        }

        @Override // com.meituan.android.recce.ReccePackage
        public final List<ViewManager> registerViewManagers(@NonNull b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90051da2936226b7c80dbe59e66c6c9b", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90051da2936226b7c80dbe59e66c6c9b");
            }
            ArrayList arrayList = new ArrayList();
            for (ReccePackage reccePackage : g.this.c) {
                if (reccePackage.registerViewManagers(bVar) != null) {
                    arrayList.addAll(reccePackage.registerViewManagers(bVar));
                }
            }
            return arrayList;
        }

        @Override // com.meituan.android.recce.ReccePackage
        public final Map<String, RecceCustomApi> getCustomApis() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb2feb5839d8f8111d35c6a82fe142b4", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb2feb5839d8f8111d35c6a82fe142b4");
            }
            HashMap hashMap = new HashMap();
            for (ReccePackage reccePackage : g.this.c) {
                if (reccePackage.getCustomApis() != null) {
                    hashMap.putAll(reccePackage.getCustomApis());
                }
            }
            return hashMap;
        }
    }
}
