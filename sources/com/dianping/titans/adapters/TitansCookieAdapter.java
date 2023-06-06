package com.dianping.titans.adapters;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TitansCookieAdapter {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnCookieChangedListener {
        void onChanged(TitansCookie titansCookie);
    }

    public List<TitansCookie> getRegisterCookies() {
        return null;
    }

    public void setCookieChangeListener(OnCookieChangedListener onCookieChangedListener) {
    }
}
