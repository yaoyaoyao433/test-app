package com.sankuai.titans.base.jshost;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.webcompat.jshost.AbsMsgCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MsgCenter extends AbsMsgCenter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<String, List<AbsMsgCenter.OnMsgReceivedListener>> msgListenerMap;

    public MsgCenter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35943d9cfb7ece0e83550ece485dfe77", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35943d9cfb7ece0e83550ece485dfe77");
        } else {
            this.msgListenerMap = new HashMap();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.AbsMsgCenter
    public <T> void publish(String str, T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d05e862c0c44a5b608c9a1f54513df8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d05e862c0c44a5b608c9a1f54513df8b");
        } else if (!TextUtils.isEmpty(str)) {
            synchronized (this.msgListenerMap) {
                List<AbsMsgCenter.OnMsgReceivedListener> list = this.msgListenerMap.get(str);
                if (list != null && list.size() != 0) {
                    for (AbsMsgCenter.OnMsgReceivedListener onMsgReceivedListener : list) {
                        if (t == null || onMsgReceivedListener.getTClass() == t.getClass()) {
                            onMsgReceivedListener.onReceiveMsg(str, t);
                        }
                    }
                }
            }
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.AbsMsgCenter
    public <T> void registerListener(String str, AbsMsgCenter.OnMsgReceivedListener<T> onMsgReceivedListener) {
        Object[] objArr = {str, onMsgReceivedListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "240d2e65046425a4073008fd16ff4475", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "240d2e65046425a4073008fd16ff4475");
        } else if (TextUtils.isEmpty(str) || onMsgReceivedListener == null) {
        } else {
            synchronized (this.msgListenerMap) {
                List<AbsMsgCenter.OnMsgReceivedListener> list = this.msgListenerMap.get(str);
                if (list == null) {
                    list = new ArrayList<>();
                    this.msgListenerMap.put(str, list);
                }
                if (list.contains(onMsgReceivedListener)) {
                    return;
                }
                list.add(onMsgReceivedListener);
            }
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.AbsMsgCenter
    public <T> void unregisterListener(String str, AbsMsgCenter.OnMsgReceivedListener<T> onMsgReceivedListener) {
        Object[] objArr = {str, onMsgReceivedListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1878097dc450f5b0d938dfa62a55afaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1878097dc450f5b0d938dfa62a55afaf");
        } else if (TextUtils.isEmpty(str) || onMsgReceivedListener == null) {
        } else {
            synchronized (this.msgListenerMap) {
                List<AbsMsgCenter.OnMsgReceivedListener> list = this.msgListenerMap.get(str);
                if (list != null && list.size() != 0) {
                    if (list.contains(onMsgReceivedListener)) {
                        list.remove(onMsgReceivedListener);
                    }
                }
            }
        }
    }
}
