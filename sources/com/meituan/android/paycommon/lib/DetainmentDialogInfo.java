package com.meituan.android.paycommon.lib;

import android.text.TextUtils;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes.dex */
public class DetainmentDialogInfo implements Serializable {
    public static final String ARG_DETAINMENT_INFO = "detainment_info";
    public static final String KEY_DETAINMENT_DIALOG_ABTEST = "6.0_cancel_alert_4_cashdesk";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1970213645322607424L;
    private String dialogMessage;
    private boolean isMarketingPayment;
    private boolean isShowDialog;
    private String nbVersion;
    private String tansId;
    private String testGroup;

    public DetainmentDialogInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4255668e34e7c428608756b2dd91741", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4255668e34e7c428608756b2dd91741");
        } else {
            this.isShowDialog = false;
        }
    }

    public boolean isShowDialog() {
        return this.isShowDialog;
    }

    public void setShowDialog(boolean z) {
        this.isShowDialog = z;
    }

    public String getDialogMessage() {
        return this.dialogMessage;
    }

    public void setDialogMessage(String str) {
        this.dialogMessage = str;
    }

    public boolean isMarketingPayment() {
        return this.isMarketingPayment;
    }

    public void setMarketingPayment(boolean z) {
        this.isMarketingPayment = z;
    }

    public String getTestGroup() {
        return this.testGroup;
    }

    public void setTestGroup(String str) {
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9146cb47d1f6466bf5d1a00a08902eb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9146cb47d1f6466bf5d1a00a08902eb0");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                str2 = (String) new JSONObject(str).get(KEY_DETAINMENT_DIALOG_ABTEST);
            } catch (JSONException e) {
                e.printStackTrace();
                com.meituan.android.paybase.common.analyse.a.a(e, "DetainmentDialog-DetainmentDialogInfo.testGroup", (Map<String, Object>) null);
            }
            this.testGroup = str2;
        }
        str2 = "";
        this.testGroup = str2;
    }

    public String getTansId() {
        return this.tansId;
    }

    public void setTansId(String str) {
        this.tansId = str;
    }

    public String getNbVersion() {
        return this.nbVersion;
    }

    public void setNbVersion(String str) {
        this.nbVersion = str;
    }
}
