package com.unionpay.mobile.android.pboctransaction.samsung;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.unionpay.mobile.android.pboctransaction.samsung.f;
import com.unionpay.mobile.android.utils.k;
import com.unionpay.tsmservice.data.AppStatus;
import com.unionpay.tsmservice.data.SeAppListItem;
import com.unionpay.tsmservice.data.VirtualCardInfo;
import com.unionpay.tsmservice.result.GetSeAppListResult;
import java.util.ArrayList;
/* loaded from: classes6.dex */
public final class g implements Handler.Callback {
    final /* synthetic */ f a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(f fVar) {
        this.a = fVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        boolean z;
        String str;
        String str2;
        f.a aVar;
        Handler handler4;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        int i;
        Handler handler8;
        Object obj;
        Handler handler9;
        Handler handler10;
        Handler handler11;
        Handler handler12;
        int i2 = message.what;
        if (i2 == 1) {
            handler = this.a.G;
            handler.removeMessages(4);
            k.c("uppay", "msg error");
            f.a(this.a, message.arg1, (String) message.obj);
        } else if (i2 != 1000) {
            if (i2 != 1018) {
                switch (i2) {
                    case 3:
                        k.c("uppay-spay", "send apdu time out");
                        f.c(this.a);
                        break;
                    case 4:
                        k.c("uppay", "timeout");
                        f.a(this.a, message.arg1, "");
                        break;
                    default:
                        switch (i2) {
                            case 1011:
                                k.c("uppay", "channel success");
                                Bundle bundle = (Bundle) message.obj;
                                this.a.s = bundle.getString("channel");
                                this.a.t = bundle.getString("apdu");
                                break;
                            case 1012:
                                k.c("uppay", "apdu success version 3.3.1");
                                handler4 = this.a.G;
                                handler4.removeMessages(3);
                                this.a.v = (String) message.obj;
                                break;
                            case 1013:
                                k.c("uppay", "close channel success");
                                this.a.x = "success";
                                break;
                            case 1014:
                                handler5 = this.a.G;
                                handler5.removeMessages(4);
                                k.c("uppay", "list success");
                                handler6 = this.a.o;
                                if (handler6 != null) {
                                    ArrayList arrayList = new ArrayList();
                                    SeAppListItem[] seAppList = ((GetSeAppListResult) message.obj).getSeAppList();
                                    if (seAppList != null && seAppList.length > 0) {
                                        arrayList = new ArrayList();
                                        for (int i3 = 0; i3 < seAppList.length; i3++) {
                                            if (seAppList[i3] != null && seAppList[i3].getAppDetail() != null && seAppList[i3].getAppDetail().getAppID() != null) {
                                                String appAid = seAppList[i3].getAppDetail().getAppID().getAppAid();
                                                if (!(appAid == null || appAid.length() <= 16 || AppStatus.APPLY.equalsIgnoreCase(appAid.substring(14, 16)))) {
                                                    arrayList.add(new com.unionpay.mobile.android.model.a(1, seAppList[i3].getAppDetail().getAppID().getAppAid(), "", seAppList[i3].getAppDetail().getMpan(), 1));
                                                }
                                            }
                                        }
                                    }
                                    handler7 = this.a.G;
                                    i = 8;
                                    obj = arrayList;
                                    handler8 = handler7;
                                    Message obtainMessage = handler8.obtainMessage(i, obj);
                                    handler9 = this.a.o;
                                    handler9.sendMessage(obtainMessage);
                                    break;
                                }
                                break;
                            case 1015:
                                handler10 = this.a.G;
                                handler10.removeMessages(4);
                                k.c("uppay-spay", "get spay list call back");
                                VirtualCardInfo virtualCardInfo = (VirtualCardInfo) message.obj;
                                Object aVar2 = new com.unionpay.mobile.android.model.a(32, virtualCardInfo.getAppID().getAppAid(), "", virtualCardInfo.getCardNo(), 1);
                                handler11 = this.a.o;
                                i = 2000;
                                obj = aVar2;
                                handler8 = handler11;
                                Message obtainMessage2 = handler8.obtainMessage(i, obj);
                                handler9 = this.a.o;
                                handler9.sendMessage(obtainMessage2);
                                break;
                            case 1016:
                                handler12 = this.a.G;
                                handler12.removeMessages(4);
                                str = "uppay-spay";
                                str2 = "check spay support";
                                break;
                        }
                }
            } else {
                handler3 = this.a.G;
                handler3.removeMessages(4);
                this.a.E = ((Bundle) message.obj).getBoolean("KEY_SUCCESS_VENDOR");
                StringBuilder sb = new StringBuilder("mIsVendorStateReady: ");
                z = this.a.E;
                sb.append(z);
                k.c("uppay-spay", sb.toString());
                str = "uppay-spay";
                str2 = "get vendor pay status";
            }
            k.c(str, str2);
            aVar = this.a.m;
            aVar.a(true);
        } else {
            handler2 = this.a.G;
            handler2.removeMessages(4);
            k.c("uppay", "init success");
            this.a.a(true);
            this.a.h = true;
        }
        return false;
    }
}
