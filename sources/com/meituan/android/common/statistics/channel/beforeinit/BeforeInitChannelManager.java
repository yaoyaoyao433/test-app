package com.meituan.android.common.statistics.channel.beforeinit;

import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BeforeInitChannelManager {
    private static final String TAG = "BeforeInit";
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isInitDelay;
    private final ConcurrentLinkedQueue<BeforeInitLxEventData> mBeforeInitLxEventDataQueue;
    private final Map<String, BeforeInitChannel> mChannels;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class BeforeInitChannelManagerHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final BeforeInitChannelManager mInstance = new BeforeInitChannelManager();
    }

    public static BeforeInitChannelManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7c5de26f395a681f33e879920d287293", 6917529027641081856L) ? (BeforeInitChannelManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7c5de26f395a681f33e879920d287293") : BeforeInitChannelManagerHolder.mInstance;
    }

    public BeforeInitChannelManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "362e54cad669ebc70b9b331d16680832", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "362e54cad669ebc70b9b331d16680832");
            return;
        }
        this.isInitDelay = false;
        this.mChannels = new HashMap();
        this.mBeforeInitLxEventDataQueue = new ConcurrentLinkedQueue<>();
    }

    public void saveBeforeInitLxEventData(BeforeInitLxEventData beforeInitLxEventData) {
        Object[] objArr = {beforeInitLxEventData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30bca1865fe640345e42e32e2edf319d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30bca1865fe640345e42e32e2edf319d");
            return;
        }
        this.mBeforeInitLxEventDataQueue.add(beforeInitLxEventData);
        LogUtil.log(TAG, "save lx event data : " + beforeInitLxEventData.toString());
    }

    public void cleanBeforeInitLxEventData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd3fef3c8f63aa8c5c6c9ec21a128a14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd3fef3c8f63aa8c5c6c9ec21a128a14");
            return;
        }
        this.mBeforeInitLxEventDataQueue.clear();
        LogUtil.log(TAG, "clean lx event data, mBeforeInitLxEventDataQueue size = " + this.mBeforeInitLxEventDataQueue.size());
    }

    public BeforeInitChannel getChannel(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e1f902dabc2a98674f7107b66c0bed1", 6917529027641081856L)) {
            return (BeforeInitChannel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e1f902dabc2a98674f7107b66c0bed1");
        }
        if (TextUtils.isEmpty(str)) {
            str = Constants.SDK_INTERNAL_CHANNEL_NAME;
        }
        synchronized (this.mChannels) {
            if (this.mChannels.containsKey(str)) {
                return this.mChannels.get(str);
            }
            BeforeInitChannel beforeInitChannel = new BeforeInitChannel(str);
            this.mChannels.put(str, beforeInitChannel);
            return beforeInitChannel;
        }
    }

    public void handleBeforeInitData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2f9282c634cf0447aa5f4eebe15e80a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2f9282c634cf0447aa5f4eebe15e80a");
        } else if (this.mBeforeInitLxEventDataQueue == null) {
        } else {
            LogUtil.log(TAG, "handle before init data, mBeforeInitLxEventDataQueue size = " + this.mBeforeInitLxEventDataQueue.size());
            if (this.isInitDelay && Statistics.getCurrentActivity() != null) {
                Statistics.startEvent(Statistics.getCurrentActivity());
            }
            if (this.mBeforeInitLxEventDataQueue.isEmpty()) {
                return;
            }
            Iterator<BeforeInitLxEventData> it = this.mBeforeInitLxEventDataQueue.iterator();
            while (it.hasNext()) {
                BeforeInitLxEventData next = it.next();
                switch (next.type) {
                    case CLICK:
                        handleMC(next);
                        break;
                    case EDIT:
                        handleME(next);
                        break;
                    case MODEL_VIEW:
                        handleMV(next);
                        break;
                    case PAGE_VIEW:
                        handlePV(next);
                        break;
                    case PAGE_DISAPPEAR:
                        handlePD(next);
                        break;
                    case ORDER:
                        handleBO(next);
                        break;
                    case PAY:
                        handleBP(next);
                        break;
                    case SC:
                        handleSC(next);
                        break;
                }
            }
        }
    }

    private void handleSC(BeforeInitLxEventData beforeInitLxEventData) {
        Object[] objArr = {beforeInitLxEventData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe51e2c56bc2500663119d9c0b902a53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe51e2c56bc2500663119d9c0b902a53");
        } else {
            Statistics.getChannel(beforeInitLxEventData.channelName).writeSystemCheck(beforeInitLxEventData.pageInfoKey, beforeInitLxEventData.bid, beforeInitLxEventData.valLab, beforeInitLxEventData.cid);
        }
    }

    private void handlePV(BeforeInitLxEventData beforeInitLxEventData) {
        Object[] objArr = {beforeInitLxEventData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31a801e05bdeca0144ec0640587c4a64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31a801e05bdeca0144ec0640587c4a64");
        } else {
            Statistics.getChannel(beforeInitLxEventData.channelName).writePageView(beforeInitLxEventData.pageInfoKey, beforeInitLxEventData.cid, beforeInitLxEventData.valLab);
        }
    }

    private void handlePD(BeforeInitLxEventData beforeInitLxEventData) {
        Object[] objArr = {beforeInitLxEventData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c2db89eebf9eecacdc5b03f4893e6fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c2db89eebf9eecacdc5b03f4893e6fe");
        } else {
            Statistics.getChannel(beforeInitLxEventData.channelName).writePageDisappear(beforeInitLxEventData.pageInfoKey, beforeInitLxEventData.cid, beforeInitLxEventData.valLab);
        }
    }

    private void handleMC(BeforeInitLxEventData beforeInitLxEventData) {
        Object[] objArr = {beforeInitLxEventData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b457c45f640a72cd407c16db8310253", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b457c45f640a72cd407c16db8310253");
        } else if (beforeInitLxEventData.hasIndex) {
            Statistics.getChannel(beforeInitLxEventData.channelName).writeModelClick(beforeInitLxEventData.pageInfoKey, beforeInitLxEventData.bid, beforeInitLxEventData.valLab, beforeInitLxEventData.cid, beforeInitLxEventData.index);
        } else {
            Statistics.getChannel(beforeInitLxEventData.channelName).writeModelClick(beforeInitLxEventData.pageInfoKey, beforeInitLxEventData.bid, beforeInitLxEventData.valLab, beforeInitLxEventData.cid, beforeInitLxEventData.withPageInfo, beforeInitLxEventData.sf);
        }
    }

    private void handleMV(BeforeInitLxEventData beforeInitLxEventData) {
        Object[] objArr = {beforeInitLxEventData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09bff2dc838693bbbab5547832b53714", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09bff2dc838693bbbab5547832b53714");
        } else if (beforeInitLxEventData.hasIndex) {
            Statistics.getChannel(beforeInitLxEventData.channelName).writeModelView(beforeInitLxEventData.pageInfoKey, beforeInitLxEventData.bid, beforeInitLxEventData.valLab, beforeInitLxEventData.cid, beforeInitLxEventData.index);
        } else {
            Statistics.getChannel(beforeInitLxEventData.channelName).writeModelView(beforeInitLxEventData.pageInfoKey, beforeInitLxEventData.bid, beforeInitLxEventData.valLab, beforeInitLxEventData.cid, beforeInitLxEventData.withPageInfo);
        }
    }

    private void handleME(BeforeInitLxEventData beforeInitLxEventData) {
        Object[] objArr = {beforeInitLxEventData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11dabf07293c77ef255fc631a5310d84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11dabf07293c77ef255fc631a5310d84");
        } else {
            Statistics.getChannel(beforeInitLxEventData.channelName).writeModelEdit(beforeInitLxEventData.pageInfoKey, beforeInitLxEventData.bid, beforeInitLxEventData.valLab, beforeInitLxEventData.cid, beforeInitLxEventData.withPageInfo);
        }
    }

    private void handleBO(BeforeInitLxEventData beforeInitLxEventData) {
        Object[] objArr = {beforeInitLxEventData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de1e4c8aac34caed5eafa4980bfa1097", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de1e4c8aac34caed5eafa4980bfa1097");
        } else {
            Statistics.getChannel(beforeInitLxEventData.channelName).writeBizOrder(beforeInitLxEventData.pageInfoKey, beforeInitLxEventData.bid, beforeInitLxEventData.valLab, beforeInitLxEventData.cid, beforeInitLxEventData.withPageInfo);
        }
    }

    private void handleBP(BeforeInitLxEventData beforeInitLxEventData) {
        Object[] objArr = {beforeInitLxEventData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d6923da7794d8096ad7bbe7e59dde41", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d6923da7794d8096ad7bbe7e59dde41");
        } else {
            Statistics.getChannel(beforeInitLxEventData.channelName).writeBizPay(beforeInitLxEventData.pageInfoKey, beforeInitLxEventData.bid, beforeInitLxEventData.valLab, beforeInitLxEventData.cid, beforeInitLxEventData.withPageInfo);
        }
    }
}
