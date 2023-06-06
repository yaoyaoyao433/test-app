package com.sankuai.waimai.addrsdk.base;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class BaseAddrActivity extends Activity {
    public static ChangeQuickRedirect a;

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bf9903783b23473217dffb83a8a8dd5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Resources) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bf9903783b23473217dffb83a8a8dd5");
        }
        Resources resources = super.getResources();
        if (resources != null && resources.getConfiguration().fontScale != 1.0f) {
            Configuration configuration = resources.getConfiguration();
            configuration.fontScale = 1.0f;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        return resources;
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Integer num;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0093f3a803e486ac5a8baeb46280206c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0093f3a803e486ac5a8baeb46280206c");
            return;
        }
        getWindow().setBackgroundDrawable(null);
        if (com.sankuai.waimai.addrsdk.utils.b.a == null) {
            com.sankuai.waimai.addrsdk.utils.b.a = getApplicationContext();
        }
        com.sankuai.waimai.addrsdk.manager.a a2 = com.sankuai.waimai.addrsdk.manager.a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.addrsdk.manager.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "ddd0a3d3c76cd81faa6fccd4d7c920b1", RobustBitConfig.DEFAULT_VALUE)) {
            num = (Integer) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "ddd0a3d3c76cd81faa6fccd4d7c920b1");
        } else if (a2.f.containsKey(a2.b)) {
            num = a2.f.get(a2.b);
        } else {
            num = 0;
        }
        setTheme((num == null || num.intValue() == 0) ? R.style.WaimaiAddrsdkTheme : num.intValue());
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af4cae2acf14afef0f8ced764b6ee662", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af4cae2acf14afef0f8ced764b6ee662");
        } else {
            super.onStart();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a67fca0905fbe9f9b6950da54469eb3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a67fca0905fbe9f9b6950da54469eb3d");
        } else {
            super.onResume();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ab914855d7c64231038a11721cbdb93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ab914855d7c64231038a11721cbdb93");
        } else {
            super.onPause();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8d9b5b3555079a18a48c7c5d02c6cd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8d9b5b3555079a18a48c7c5d02c6cd6");
        } else {
            super.onStop();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d178a01fd9aff3c782fa7c2c1e35d35e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d178a01fd9aff3c782fa7c2c1e35d35e");
        } else {
            super.onDestroy();
        }
    }
}
