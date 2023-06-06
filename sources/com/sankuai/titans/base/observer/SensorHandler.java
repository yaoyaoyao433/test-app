package com.sankuai.titans.base.observer;

import android.content.Context;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.observer.ShakeListener;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SensorHandler {
    private static final int VALID_TRIGGER_INTERVAL = 2000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile SensorHandler instance;
    private long lastClickTime;
    public ArrayList<IShakeListener> listeners;
    private Context mContext;
    private ShakeListener shaker;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface IShakeListener {
        void onShake();
    }

    public static SensorHandler getInstance(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ef95060df29c53fac3de578ecd5ed8e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (SensorHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ef95060df29c53fac3de578ecd5ed8e8");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16ac436c759e361b703eb606f7dc99c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16ac436c759e361b703eb606f7dc99c6");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69e4bdf7b634e551847a3170fe623bfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69e4bdf7b634e551847a3170fe623bfb");
        } else if (this.mContext == null) {
        } else {
            if (this.shaker == null) {
                this.shaker = new ShakeListener(this.mContext);
                this.shaker.setOnShakeListener(new ShakeListener.OnShakeListener() { // from class: com.sankuai.titans.base.observer.SensorHandler.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.titans.base.observer.ShakeListener.OnShakeListener
                    public void onShake() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9d807933d567f10ee54a43a943a68c00", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9d807933d567f10ee54a43a943a68c00");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d659fb3f4a280535df902adc00d646ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d659fb3f4a280535df902adc00d646ab");
        } else if (this.shaker != null) {
            this.shaker.pause();
        }
    }

    public void registerShakeListener(IShakeListener iShakeListener) {
        Object[] objArr = {iShakeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ca5068ee2120354ca5b4a41afd2ac43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ca5068ee2120354ca5b4a41afd2ac43");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1288cd2e51b52f32440112e8519f02e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1288cd2e51b52f32440112e8519f02e");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef23742ce83f9b4de2bb608c73cf2aa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef23742ce83f9b4de2bb608c73cf2aa1");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "edb677d29cdce1b665574a06d4755bbb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "edb677d29cdce1b665574a06d4755bbb")).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastClickTime > ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE) {
            this.lastClickTime = currentTimeMillis;
            return true;
        }
        return false;
    }
}
