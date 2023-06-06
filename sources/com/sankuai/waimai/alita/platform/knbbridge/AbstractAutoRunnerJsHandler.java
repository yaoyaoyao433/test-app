package com.sankuai.waimai.alita.platform.knbbridge;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class AbstractAutoRunnerJsHandler extends AbstractAlitaJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static ConcurrentHashMap<String, a> mObserverMap = new ConcurrentHashMap<>();

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public String a;
        public String b;
        public AlitaAutoRunManager.b c;

        public a(String str, String str2, AlitaAutoRunManager.b bVar) {
            this.a = str;
            this.b = str2;
            this.c = bVar;
        }
    }

    public void addObserver(String str, String str2, String str3, AlitaAutoRunManager.b bVar) {
        Object[] objArr = {str, str2, str3, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "264d2edf63f12bbf8612720bf2502f36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "264d2edf63f12bbf8612720bf2502f36");
        } else if (mObserverMap == null || TextUtils.isEmpty(str3)) {
        } else {
            mObserverMap.put(str3, new a(str, str2, bVar));
        }
    }

    public void removeObserver(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b077dc112c8918b5d2f0d3e0da86995", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b077dc112c8918b5d2f0d3e0da86995");
        } else if (mObserverMap == null || TextUtils.isEmpty(str)) {
        } else {
            mObserverMap.remove(str);
        }
    }

    public boolean containKeys(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "457c60b58ed61902af998fafed70fd97", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "457c60b58ed61902af998fafed70fd97")).booleanValue();
        }
        if (mObserverMap == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return mObserverMap.containsKey(str);
    }

    public static AlitaAutoRunManager.b getObserver(String str) {
        a aVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ed1b9ee2d604620ae858590a36649b89", RobustBitConfig.DEFAULT_VALUE)) {
            return (AlitaAutoRunManager.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ed1b9ee2d604620ae858590a36649b89");
        }
        if (mObserverMap == null || TextUtils.isEmpty(str) || (aVar = mObserverMap.get(str)) == null) {
            return null;
        }
        return aVar.c;
    }
}
