package com.meituan.android.legwork.bean.im;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class IMInitializeData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int businessType;
    public HashMap<String, String> ext;
    public OrderAddressView fetchAddress;
    public List<Integer> funcConf;
    public List<IMMsgTemplate> imTemplate;
    public String informMsg;
    public String notSupportSendLocationToast;
    public String opMsg;
    public String orderId;
    public int orderStatus;
    public short peerAppId;
    public long peerId;
    public boolean peerSendReceiptLocationSupport;
    public OrderAddressView recipientAddress;
    public String riderName;
    public boolean showTips;
    public String tips;
}
