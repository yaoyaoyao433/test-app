package com.sankuai.waimai.business.im.msgcenter;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.util.LongSparseArray;
import android.text.TextUtils;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager;
import com.sankuai.waimai.business.im.api.msgcenter.a;
import com.sankuai.waimai.business.im.api.msgcenter.model.UnReadMsgData;
import com.sankuai.waimai.business.im.api.msgcenter.model.UnReadMsgEntity;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.imbase.d;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.waimai.imbase.manager.e;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.router.annotation.RouterProvider;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MsgCenterManagerImpl implements IMsgCenterManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static int mUnReadImCount;
    private static int mUnreadSysCount;
    private static MsgCenterManagerImpl sInstance;
    private boolean isShowMsgCenterDot;
    private Set<a.b> mMsgCenterUnReadCountObservers;
    private String mUnReadMsgCenterH5;
    private UnReadMsgEntity mUnReadMsgInfo;
    private boolean showMsgCenterEntrance;
    private d unReadCountObserver;

    public MsgCenterManagerImpl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f78e8a3a41991693ff59f2b234bb341c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f78e8a3a41991693ff59f2b234bb341c");
            return;
        }
        this.unReadCountObserver = new d() { // from class: com.sankuai.waimai.business.im.msgcenter.MsgCenterManagerImpl.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.d
            public final void updateUnReadCount(@NonNull LongSparseArray<Integer> longSparseArray) {
                Object[] objArr2 = {longSparseArray};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "697d781d6eed54555148909a486d5dd5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "697d781d6eed54555148909a486d5dd5");
                } else {
                    MsgCenterManagerImpl.this.getIMUnreadCount();
                }
            }
        };
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(b.a, "last_msg_center_refresh_time");
        e.a().a(this.unReadCountObserver);
        getIMUnreadCount();
        registerH5BroadcastReceiver();
    }

    @RouterProvider
    public static MsgCenterManagerImpl getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "edebc4dfa315f6253c68ac8cf65a0085", RobustBitConfig.DEFAULT_VALUE)) {
            return (MsgCenterManagerImpl) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "edebc4dfa315f6253c68ac8cf65a0085");
        }
        if (sInstance == null) {
            synchronized (MsgCenterManagerImpl.class) {
                if (sInstance == null) {
                    sInstance = new MsgCenterManagerImpl();
                }
            }
        }
        return sInstance;
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
    public boolean showMsgCenterDot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f25a5cf162bd704f28db54b0030051d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f25a5cf162bd704f28db54b0030051d")).booleanValue() : getUnreadMsgCenterCount() > 0 || this.isShowMsgCenterDot;
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
    public boolean isMsgCenter(Activity activity) {
        Bundle extras;
        String queryParameter;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20864974e782098aaf31872a52b99c16", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20864974e782098aaf31872a52b99c16")).booleanValue();
        }
        if (activity == null || activity.getIntent() == null || getMsgCenterH5() == null || (extras = activity.getIntent().getExtras()) == null || (queryParameter = Uri.parse(getMsgCenterH5()).getQueryParameter("inner_url")) == null) {
            return false;
        }
        return extras.toString().contains(queryParameter);
    }

    private int getUnreadMsgCenterCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0c42c0a3a0baa59eb9223d98c50e0ba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0c42c0a3a0baa59eb9223d98c50e0ba")).intValue();
        }
        mUnreadSysCount = mUnreadSysCount < 0 ? 0 : mUnreadSysCount;
        mUnReadImCount = mUnReadImCount >= 0 ? mUnReadImCount : 0;
        return mUnreadSysCount + mUnReadImCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getMsgCenterH5() {
        return this.mUnReadMsgCenterH5;
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
    public void clickMsgCenter(final Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03bb3ff56514ed79552ac40e62b65b84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03bb3ff56514ed79552ac40e62b65b84");
        } else if (!p.a(activity)) {
            ae.a(activity, (int) R.string.wm_im_error_network);
        } else {
            com.sankuai.waimai.platform.domain.manager.user.a.a(activity, new Runnable() { // from class: com.sankuai.waimai.business.im.msgcenter.MsgCenterManagerImpl.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "637890d2d327a703520f8b9c17a87f6a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "637890d2d327a703520f8b9c17a87f6a");
                        return;
                    }
                    String msgCenterH5 = MsgCenterManagerImpl.this.getMsgCenterH5();
                    if (!TextUtils.isEmpty(msgCenterH5)) {
                        com.sankuai.waimai.foundation.router.a.a(activity, msgCenterH5);
                    } else {
                        ae.a(activity, (int) R.string.wm_im_message_center_url_invalid);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
    public void registerMsgCenterUnreadChangeListener(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "333094847d5d7f553245658303c67724", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "333094847d5d7f553245658303c67724");
            return;
        }
        synchronized (this) {
            if (this.mMsgCenterUnReadCountObservers == null) {
                this.mMsgCenterUnReadCountObservers = new HashSet();
            }
            this.mMsgCenterUnReadCountObservers.add(bVar);
        }
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
    public void unregisterMsgCenterUnreadChangeListener(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b23a1a0777321ea6905aba8f2f4fe400", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b23a1a0777321ea6905aba8f2f4fe400");
            return;
        }
        synchronized (this) {
            if (this.mMsgCenterUnReadCountObservers != null) {
                this.mMsgCenterUnReadCountObservers.remove(bVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getIMUnreadCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee27085735a72d4682d529efe478b232", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee27085735a72d4682d529efe478b232");
        } else if (com.sankuai.waimai.foundation.core.a.f() || !com.sankuai.waimai.imbase.manager.b.a().b()) {
            mUnReadImCount = 0;
            updateMsgCenterUnReadCount();
        } else {
            com.sankuai.waimai.imbase.manager.b.a().a(new d.a() { // from class: com.sankuai.waimai.business.im.msgcenter.MsgCenterManagerImpl.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.imbase.manager.d.a
                public final void a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0ffc049d17ecf44960a8a050b7f88870", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0ffc049d17ecf44960a8a050b7f88870");
                        return;
                    }
                    int unused = MsgCenterManagerImpl.mUnReadImCount = i;
                    MsgCenterManagerImpl.this.updateMsgCenterUnReadCount();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateMsgCenterUnReadCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce6e22f8e6d156788c6722abe10a375b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce6e22f8e6d156788c6722abe10a375b");
            return;
        }
        synchronized (this) {
            if (this.mMsgCenterUnReadCountObservers != null && this.mMsgCenterUnReadCountObservers.size() > 0) {
                for (a.b bVar : this.mMsgCenterUnReadCountObservers) {
                    if (bVar != null) {
                        bVar.a(this.showMsgCenterEntrance, getUnreadMsgCenterCount() <= 0 && showMsgCenterDot(), getUnreadMsgCenterCount());
                    }
                }
            }
        }
    }

    private void registerH5BroadcastReceiver() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "127380631e3ed959e003df8dafd57eaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "127380631e3ed959e003df8dafd57eaf");
            return;
        }
        b.a.registerReceiver(new BroadcastReceiver() { // from class: com.sankuai.waimai.business.im.msgcenter.MsgCenterManagerImpl.5
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                boolean z = true;
                Object[] objArr2 = {context, intent};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fb374213ce96108e67535b681665d213", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fb374213ce96108e67535b681665d213");
                } else if (intent == null || TextUtils.isEmpty(f.a(intent, "data"))) {
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(f.a(intent, "data"));
                        MsgCenterManagerImpl msgCenterManagerImpl = MsgCenterManagerImpl.this;
                        if (jSONObject.optInt("reddotnum", 0) == 0) {
                            z = false;
                        }
                        msgCenterManagerImpl.isShowMsgCenterDot = z;
                        int unused = MsgCenterManagerImpl.mUnreadSysCount = jSONObject.optInt("amount", 0);
                        MsgCenterManagerImpl.this.updateMsgCenterUnReadCount();
                    } catch (JSONException e) {
                        com.sankuai.waimai.foundation.utils.log.a.a("UnReadMsgBlock", e);
                    }
                }
            }
        }, new IntentFilter("waimai:clear_nonim_message"));
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
    public void refreshMsgCenterSysCount(int i) {
        mUnreadSysCount = i;
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
    public void refreshMsgCenterImCount(int i) {
        mUnReadImCount = i;
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
    public UnReadMsgEntity getUnReadMsgInfo() {
        return this.mUnReadMsgInfo;
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
    public int getUnReadImCount() {
        return mUnReadImCount;
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
    public void refreshMsgCenterUnReadCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2cb3adb9d16acca1c98bc729ff33847", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2cb3adb9d16acca1c98bc729ff33847");
            return;
        }
        long b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(b.a, "last_msg_center_refresh_time", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b < com.sankuai.waimai.platform.capacity.persistent.sp.a.b(b.a, "message_center_refresh_time", 30) * 1000) {
            getIMUnreadCount();
            return;
        }
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(b.a, "last_msg_center_refresh_time", currentTimeMillis);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((MsgCenterApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) MsgCenterApi.class)).getUnreadSystemMsg(), new b.AbstractC1042b<BaseResponse<UnReadMsgData>>() { // from class: com.sankuai.waimai.business.im.msgcenter.MsgCenterManagerImpl.4
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final void onError(Throwable th) {
            }

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "72a95c33891ac79cae56601023299edd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "72a95c33891ac79cae56601023299edd");
                    return;
                }
                MsgCenterManagerImpl.this.showMsgCenterEntrance = false;
                if (baseResponse != null && baseResponse.code == 0 && baseResponse.data != 0) {
                    MsgCenterManagerImpl.this.mUnReadMsgInfo = ((UnReadMsgData) baseResponse.data).unReadMsgEntity;
                    if (MsgCenterManagerImpl.this.mUnReadMsgInfo != null) {
                        if (MsgCenterManagerImpl.this.mUnReadMsgInfo.showIcon == 1 && !TextUtils.isEmpty(MsgCenterManagerImpl.this.mUnReadMsgInfo.h5Url)) {
                            MsgCenterManagerImpl.this.showMsgCenterEntrance = true;
                        }
                        MsgCenterManagerImpl.this.isShowMsgCenterDot = MsgCenterManagerImpl.this.mUnReadMsgInfo.msgType == UnReadMsgEntity.MSG_TYPE_DOT;
                        int unused = MsgCenterManagerImpl.mUnreadSysCount = MsgCenterManagerImpl.this.mUnReadMsgInfo.unReadCount;
                        MsgCenterManagerImpl.this.mUnReadMsgCenterH5 = MsgCenterManagerImpl.this.mUnReadMsgInfo.h5Url;
                    }
                }
                MsgCenterManagerImpl.this.updateMsgCenterUnReadCount();
            }
        }, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
    }
}
