package com.dianping.picasso;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.dianping.picasso.model.ButtonModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoNotificationCenter {
    public static final int EVENT_CLICK = 1;
    public static ClickListener baseClickListeners;
    public static ChangeQuickRedirect changeQuickRedirect;
    public Context mContext;
    public NotificationListener notificationListeners;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface ClickListener {
        void click(Context context, String str, JSONObject jSONObject);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface NotificationListener {
        void notificationName(int i, String str, String str2, String str3);
    }

    public PicassoNotificationCenter(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ad2fa7563194572e0384d13bce4e877", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ad2fa7563194572e0384d13bce4e877");
        } else {
            this.mContext = context;
        }
    }

    public void postNotificationName(Context context, int i, ButtonModel buttonModel) {
        Object[] objArr = {context, Integer.valueOf(i), buttonModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "338d7723268fbe8c04a2befe8edeca81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "338d7723268fbe8c04a2befe8edeca81");
            return;
        }
        try {
            if (!TextUtils.isEmpty(buttonModel.schema) && this.mContext != null) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(buttonModel.schema));
                if (this.mContext instanceof Application) {
                    intent.setFlags(y.a);
                }
                this.mContext.startActivity(intent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (baseClickListeners != null) {
            baseClickListeners.click(context, buttonModel.gaLabel, buttonModel.getViewParams().gaUserInfoObject);
        }
        if (this.notificationListeners != null) {
            this.notificationListeners.notificationName(i, buttonModel.schema, buttonModel.tag, buttonModel.data);
        }
    }

    public void setObserver(NotificationListener notificationListener) {
        this.notificationListeners = notificationListener;
    }

    public static void setBaseClickListeners(ClickListener clickListener) {
        baseClickListeners = clickListener;
    }
}
