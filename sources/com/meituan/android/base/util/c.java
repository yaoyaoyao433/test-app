package com.meituan.android.base.util;

import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.channel.Channel;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventLevel;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends EventInfo {
        public static ChangeQuickRedirect a;
        public int b;
        private String c;

        public a(String str, Map<String, Object> map) {
            Object[] objArr = {str, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "961e8c6a0b0a503f288751ef77bfac7b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "961e8c6a0b0a503f288751ef77bfac7b");
                return;
            }
            this.b = 0;
            this.level = EventLevel.URGENT;
            this.val_bid = str;
            if (map != null) {
                this.val_lab = map;
            }
        }

        public final a a(Object obj, String str) {
            Object[] objArr = {obj, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "828b8f2d6dc7c9b98ce9f995ac831f9b", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "828b8f2d6dc7c9b98ce9f995ac831f9b");
            }
            this.c = AppUtil.generatePageInfoKey(obj);
            this.val_cid = str;
            return this;
        }

        public final void a() {
            int i;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a34c04e8776a29f7451bb11ac057fffb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a34c04e8776a29f7451bb11ac057fffb");
                return;
            }
            Channel channel = Statistics.getChannel();
            if (channel == null) {
                return;
            }
            if (this.b == 0) {
                channel.writeEvent(this.c, this);
            } else if (this.b == 1) {
                if (TextUtils.isEmpty(this.index)) {
                    if (this.nm == EventName.CLICK) {
                        channel.writeModelClick(this.c, this.val_bid, this.val_lab, this.val_cid);
                        return;
                    } else if (this.nm == EventName.MODEL_VIEW) {
                        channel.writeModelView(this.c, this.val_bid, this.val_lab, this.val_cid);
                        return;
                    } else if (this.nm == EventName.PAGE_VIEW) {
                        channel.writePageView(this.c, this.val_cid, this.val_lab);
                        return;
                    } else if (this.nm == EventName.PAGE_DISAPPEAR) {
                        channel.writePageDisappear(this.c, this.val_cid, this.val_lab);
                        return;
                    } else {
                        return;
                    }
                }
                try {
                    i = Integer.parseInt(this.index);
                } catch (Exception unused) {
                    i = -1;
                }
                if (this.nm == EventName.CLICK) {
                    channel.writeModelClick(this.c, this.val_bid, this.val_lab, this.val_cid, i);
                } else if (this.nm == EventName.MODEL_VIEW) {
                    channel.writeModelView(this.c, this.val_bid, this.val_lab, this.val_cid, i);
                } else if (this.nm == EventName.PAGE_VIEW) {
                    channel.writePageView(this.c, this.val_cid, this.val_lab);
                } else if (this.nm == EventName.PAGE_DISAPPEAR) {
                    channel.writePageDisappear(this.c, this.val_cid, this.val_lab);
                }
            }
        }
    }
}
