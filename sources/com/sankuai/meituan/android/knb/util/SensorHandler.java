package com.sankuai.meituan.android.knb.util;

import android.content.Context;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.util.ShakeListener;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SensorHandler {
    protected static final int VALID_TRIGGER_INTERVAL = 2000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static SensorHandler instance;
    private long lastClickTime;
    public ArrayList<IShakeListener> listeners;
    protected Context mContext;
    private ShakeListener shaker;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface IShakeListener {
        void onShake();
    }

    public static SensorHandler getInstance(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1dc5afa10dab228f9d082b26b6d4f91b", RobustBitConfig.DEFAULT_VALUE)) {
            return (SensorHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1dc5afa10dab228f9d082b26b6d4f91b");
        }
        if (instance == null) {
            synchronized (SensorHandler.class) {
                if (instance == null) {
                    instance = new SensorHandler(context);
                }
            }
        }
        return instance;
    }

    public SensorHandler(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bc1129f32ec880fc9ac257c00600ea3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bc1129f32ec880fc9ac257c00600ea3");
            return;
        }
        this.listeners = null;
        if (context != null) {
            this.listeners = new ArrayList<>();
            this.mContext = context.getApplicationContext();
        }
    }

    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7803523d76151eb3d176f14fc43376a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7803523d76151eb3d176f14fc43376a1");
        } else if (this.mContext == null) {
        } else {
            if (this.shaker == null) {
                this.shaker = new ShakeListener(this.mContext);
                this.shaker.setOnShakeListener(new ShakeListener.OnShakeListener() { // from class: com.sankuai.meituan.android.knb.util.SensorHandler.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.meituan.android.knb.util.ShakeListener.OnShakeListener
                    public void onShake() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6d0fa5490bae6d771400c3b8c85b0ee1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6d0fa5490bae6d771400c3b8c85b0ee1");
                        } else if (SensorHandler.this.isValidTrigger()) {
                            SensorHandler.this.handleShakeEvent();
                        }
                    }
                });
            }
            this.shaker.resume();
        }
    }

    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6f113a25dfb9615062285c240e2e7c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6f113a25dfb9615062285c240e2e7c2");
        } else if (this.shaker != null) {
            this.shaker.pause();
        }
    }

    public void registerShakeListener(IShakeListener iShakeListener) {
        Object[] objArr = {iShakeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e300b35c96b8372150145a5f294bfd45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e300b35c96b8372150145a5f294bfd45");
            return;
        }
        if (this.listeners.isEmpty()) {
            onResume();
        }
        if (this.listeners.contains(iShakeListener)) {
            return;
        }
        this.listeners.add(iShakeListener);
    }

    public void unregisterShakeListener(IShakeListener iShakeListener) {
        Object[] objArr = {iShakeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fb83758bc45e50a8f3424dc5247c1af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fb83758bc45e50a8f3424dc5247c1af");
            return;
        }
        this.listeners.remove(iShakeListener);
        if (this.listeners.isEmpty()) {
            onPause();
        }
    }

    public void handleShakeEvent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2df6bc7d08adb3d8f5d792aa02111180", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2df6bc7d08adb3d8f5d792aa02111180");
        } else if (this.listeners.isEmpty()) {
        } else {
            Iterator<IShakeListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                IShakeListener next = it.next();
                if (next != null) {
                    next.onShake();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isValidTrigger() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6f3e22d758946ea954f3a71f602bfe4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6f3e22d758946ea954f3a71f602bfe4")).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastClickTime > ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE) {
            this.lastClickTime = currentTimeMillis;
            return true;
        }
        return false;
    }
}
