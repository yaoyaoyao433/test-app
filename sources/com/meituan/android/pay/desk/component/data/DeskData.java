package com.meituan.android.pay.desk.component.data;

import com.meituan.android.pay.common.payment.data.c;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paycommon.lib.DetainmentDialogInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.HashMap;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class DeskData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2625425248719897951L;
    private c desk;
    private DetainmentDialogInfo detainmentDialogInfo;
    private HashMap<String, String> extraParams;
    private boolean failTooManyTimesToGoToPSW;
    private String noPasswordPayUrl;
    private com.meituan.android.pay.common.payment.data.a selectPayment;

    public c getDesk() {
        return this.desk;
    }

    public void setDesk(c cVar) {
        this.desk = cVar;
    }

    public com.meituan.android.pay.common.payment.data.a getSelectPayment() {
        return this.selectPayment;
    }

    public void setSelectPayment(com.meituan.android.pay.common.payment.data.a aVar) {
        this.selectPayment = aVar;
    }

    public boolean isFailTooManyTimesToGoToPSW() {
        return this.failTooManyTimesToGoToPSW;
    }

    public void setFailTooManyTimesToGoToPSW(boolean z) {
        this.failTooManyTimesToGoToPSW = z;
    }

    public DetainmentDialogInfo getDetainmentDialogInfo() {
        return this.detainmentDialogInfo;
    }

    public void setDetainmentDialogInfo(DetainmentDialogInfo detainmentDialogInfo) {
        this.detainmentDialogInfo = detainmentDialogInfo;
    }

    public HashMap<String, String> getExtraParams() {
        return this.extraParams;
    }

    public void setExtraParams(HashMap<String, String> hashMap) {
        this.extraParams = hashMap;
    }

    public String getNoPasswordPayUrl() {
        return this.noPasswordPayUrl;
    }

    public void setNoPasswordPayUrl(String str) {
        this.noPasswordPayUrl = str;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public DeskData b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fe605796f724cd3c521a850857a061f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fe605796f724cd3c521a850857a061f");
            } else {
                this.b = new DeskData();
            }
        }

        public final a a(c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f406a4c3630c049219aca1a384cc499", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f406a4c3630c049219aca1a384cc499");
            }
            this.b.setDesk(cVar);
            return this;
        }

        public final a a(com.meituan.android.pay.common.payment.data.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c25aa5dd263f46d42a19540dd7050a0", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c25aa5dd263f46d42a19540dd7050a0");
            }
            this.b.setSelectPayment(aVar);
            return this;
        }

        public final a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48be0c78c6a3a93dfe7f1188efd77d09", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48be0c78c6a3a93dfe7f1188efd77d09");
            }
            this.b.setNoPasswordPayUrl(str);
            return this;
        }
    }
}
