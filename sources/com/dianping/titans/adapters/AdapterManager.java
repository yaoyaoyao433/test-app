package com.dianping.titans.adapters;

import com.dianping.titans.adapters.TitansCookieAdapter;
import com.dianping.titans.utils.CookieUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AdapterManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile AdapterManager sInstance;
    private TitansCookieAdapter cookieAdapter;
    private boolean isRegisterCookiesInjected;

    public void setCookieAdapter(TitansCookieAdapter titansCookieAdapter) {
        this.cookieAdapter = titansCookieAdapter;
    }

    public void injectRegisterCookies() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e09434df004bf1eb455f165096f98c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e09434df004bf1eb455f165096f98c0");
        } else if (this.cookieAdapter != null && !this.isRegisterCookiesInjected) {
            List<TitansCookie> registerCookies = this.cookieAdapter.getRegisterCookies();
            if (registerCookies != null) {
                for (TitansCookie titansCookie : registerCookies) {
                    CookieUtil.setCookie(titansCookie);
                }
            }
            this.cookieAdapter.setCookieChangeListener(new TitansCookieAdapter.OnCookieChangedListener() { // from class: com.dianping.titans.adapters.AdapterManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.titans.adapters.TitansCookieAdapter.OnCookieChangedListener
                public void onChanged(TitansCookie titansCookie2) {
                    Object[] objArr2 = {titansCookie2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "655de96af2ad5c68c998f81207024c50", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "655de96af2ad5c68c998f81207024c50");
                    } else {
                        CookieUtil.setCookie(titansCookie2);
                    }
                }
            });
            this.isRegisterCookiesInjected = true;
        }
    }

    public static AdapterManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "efb7a5bc6a59d05575a930afe0f8523e", RobustBitConfig.DEFAULT_VALUE)) {
            return (AdapterManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "efb7a5bc6a59d05575a930afe0f8523e");
        }
        if (sInstance == null) {
            synchronized (AdapterManager.class) {
                if (sInstance == null) {
                    sInstance = new AdapterManager();
                }
            }
        }
        return sInstance;
    }

    public AdapterManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61b31a823b879eaa033217815e7f90e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61b31a823b879eaa033217815e7f90e3");
        } else {
            this.isRegisterCookiesInjected = false;
        }
    }
}
