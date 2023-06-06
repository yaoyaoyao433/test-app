package com.meituan.android.legwork.bean.im.insertmassage;

import android.support.annotation.Keep;
import com.google.gson.Gson;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class ImInsertMessageView implements Serializable {
    public static final int IM_INSERT_MESSAGE_TYPE_RECEIVE_ADDRESS = 1;
    public static final int IM_INSERT_MESSAGE_TYPE_SEND_ADDRESS = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    public String buttonText;
    public String content;
    public Map<String, String> extraMap;
    public String title;
    public int type;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes2.dex */
    public static class ReceiveAddress implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String addressLat;
        public String addressLng;
        public String orderViewId;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "423d6f34a0b6ec535ddeeebc6ce1117c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "423d6f34a0b6ec535ddeeebc6ce1117c");
        }
        try {
            return new Gson().toJson(this);
        } catch (Exception e) {
            x.e("ImInsertMessageView.toString()", "exception msg:", e);
            x.a(e);
            return super.toString();
        }
    }
}
