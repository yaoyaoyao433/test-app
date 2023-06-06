package com.sankuai.meituan.arbiter.hook;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Instrumentation;
import android.app.UiAutomation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MTInstrumentation extends Instrumentation {
    public static ChangeQuickRedirect changeQuickRedirect;
    private MTInstrumentation mMTInstrumentation;

    public MTInstrumentation getNext() {
        return this.mMTInstrumentation;
    }

    public void setNext(MTInstrumentation mTInstrumentation) {
        this.mMTInstrumentation = mTInstrumentation;
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "144493de1cf90273beb738ffa5b8eff7", RobustBitConfig.DEFAULT_VALUE) ? (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "144493de1cf90273beb738ffa5b8eff7") : getNext().execStartActivity(context, iBinder, iBinder2, activity, intent, i);
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i) {
        Object[] objArr = {context, iBinder, iBinder2, fragment, intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "877dbdc6530e783d4f34e12e145b6dd7", RobustBitConfig.DEFAULT_VALUE) ? (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "877dbdc6530e783d4f34e12e145b6dd7") : getNext().execStartActivity(context, iBinder, iBinder2, fragment, intent, i);
    }

    @TargetApi(16)
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "656a22a1a2e03182e317c03466a971f7", RobustBitConfig.DEFAULT_VALUE) ? (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "656a22a1a2e03182e317c03466a971f7") : getNext().execStartActivity(context, iBinder, iBinder2, activity, intent, i, bundle);
    }

    @TargetApi(16)
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, fragment, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bf9395c86550a06e28e8432f66a175d", RobustBitConfig.DEFAULT_VALUE) ? (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bf9395c86550a06e28e8432f66a175d") : getNext().execStartActivity(context, iBinder, iBinder2, fragment, intent, i, bundle);
    }

    @TargetApi(17)
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle, UserHandle userHandle) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i), bundle, userHandle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d83e3363be948f26c26139863a36967", RobustBitConfig.DEFAULT_VALUE) ? (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d83e3363be948f26c26139863a36967") : getNext().execStartActivity(context, iBinder, iBinder2, activity, intent, i, bundle, userHandle);
    }

    @TargetApi(17)
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i, Bundle bundle, UserHandle userHandle) {
        Object[] objArr = {context, iBinder, iBinder2, str, intent, Integer.valueOf(i), bundle, userHandle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba5fb9341d99d7b60a40cb37554088ba", RobustBitConfig.DEFAULT_VALUE) ? (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba5fb9341d99d7b60a40cb37554088ba") : getNext().execStartActivity(context, iBinder, iBinder2, str, intent, i, bundle, userHandle);
    }

    @TargetApi(23)
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, str, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2614de906716d6a4dd972e893e5ebf3f", RobustBitConfig.DEFAULT_VALUE) ? (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2614de906716d6a4dd972e893e5ebf3f") : getNext().execStartActivity(context, iBinder, iBinder2, str, intent, i, bundle);
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) throws InstantiationException, IllegalAccessException {
        Object[] objArr = {cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "167ac35abc2b5cb1eeef6a0599ea8e8a", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "167ac35abc2b5cb1eeef6a0599ea8e8a") : getNext().newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Object[] objArr = {classLoader, str, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "244cd98caaed64229fe7685e6843c788", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "244cd98caaed64229fe7685e6843c788") : getNext().newActivity(classLoader, str, intent);
    }

    @Override // android.app.Instrumentation
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7802588c3a7334886bc3c82ce795cfd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7802588c3a7334886bc3c82ce795cfd0");
        } else {
            getNext().onCreate(bundle);
        }
    }

    @Override // android.app.Instrumentation
    public void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2a2b32b4ed4adef3ef848fad3222f6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2a2b32b4ed4adef3ef848fad3222f6a");
        } else {
            getNext().start();
        }
    }

    @Override // android.app.Instrumentation
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8dc97f33646d1eecff84dcecb189c603", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8dc97f33646d1eecff84dcecb189c603");
        } else {
            getNext().onStart();
        }
    }

    @Override // android.app.Instrumentation
    public boolean onException(Object obj, Throwable th) {
        Object[] objArr = {obj, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5295f0d0be3a47eb6207076098dfcaa1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5295f0d0be3a47eb6207076098dfcaa1")).booleanValue() : getNext().onException(obj, th);
    }

    @Override // android.app.Instrumentation
    public void sendStatus(int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0de843d79c78f471dafd333164b95c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0de843d79c78f471dafd333164b95c7");
        } else {
            getNext().sendStatus(i, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public void finish(int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83c4c0d1cb5cb1361c6ab9e5db64fb3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83c4c0d1cb5cb1361c6ab9e5db64fb3d");
        } else {
            getNext().finish(i, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public void setAutomaticPerformanceSnapshots() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b09ac1f507a2ffeb8ff444786a61ad06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b09ac1f507a2ffeb8ff444786a61ad06");
        } else {
            getNext().setAutomaticPerformanceSnapshots();
        }
    }

    @Override // android.app.Instrumentation
    public void startPerformanceSnapshot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cae89064b2b25d95ab520cc8c2024ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cae89064b2b25d95ab520cc8c2024ea");
        } else {
            getNext().startPerformanceSnapshot();
        }
    }

    @Override // android.app.Instrumentation
    public void endPerformanceSnapshot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d011c46d2267c5ab002eae08a6bc0248", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d011c46d2267c5ab002eae08a6bc0248");
        } else {
            getNext().endPerformanceSnapshot();
        }
    }

    @Override // android.app.Instrumentation
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae675f80c2b4ad2a3ffa01b6814c90cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae675f80c2b4ad2a3ffa01b6814c90cd");
        } else {
            getNext().onDestroy();
        }
    }

    @Override // android.app.Instrumentation
    public Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c74323c93a6d3920b79edbde609cdf26", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c74323c93a6d3920b79edbde609cdf26") : getNext().getContext();
    }

    @Override // android.app.Instrumentation
    public ComponentName getComponentName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbb362e519a0bf90e991e76a2395aefe", RobustBitConfig.DEFAULT_VALUE) ? (ComponentName) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbb362e519a0bf90e991e76a2395aefe") : getNext().getComponentName();
    }

    @Override // android.app.Instrumentation
    public Context getTargetContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32735cca225fe96bb53298b9025cb643", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32735cca225fe96bb53298b9025cb643") : getNext().getTargetContext();
    }

    @Override // android.app.Instrumentation
    public boolean isProfiling() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d82c90f754eb43b8ff368310cc1591ac", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d82c90f754eb43b8ff368310cc1591ac")).booleanValue() : getNext().isProfiling();
    }

    @Override // android.app.Instrumentation
    public void startProfiling() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4d4b8aef96796e19b3d993e68acffc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4d4b8aef96796e19b3d993e68acffc1");
        } else {
            getNext().startProfiling();
        }
    }

    @Override // android.app.Instrumentation
    public void stopProfiling() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7de3b0610cf628acc3e648a0605eb28d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7de3b0610cf628acc3e648a0605eb28d");
        } else {
            getNext().stopProfiling();
        }
    }

    @Override // android.app.Instrumentation
    public void setInTouchMode(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bef500846e5703ce6573d13524439111", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bef500846e5703ce6573d13524439111");
        } else {
            getNext().setInTouchMode(z);
        }
    }

    @Override // android.app.Instrumentation
    public void waitForIdle(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccc504e7a705f57fa6afa2b88db8d2f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccc504e7a705f57fa6afa2b88db8d2f4");
        } else {
            getNext().waitForIdle(runnable);
        }
    }

    @Override // android.app.Instrumentation
    public void waitForIdleSync() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "720b840a2cdaf20d21613b1f97dbea89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "720b840a2cdaf20d21613b1f97dbea89");
        } else {
            getNext().waitForIdleSync();
        }
    }

    @Override // android.app.Instrumentation
    public void runOnMainSync(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2424f8e35ef23dbd99f4fa39e0c823ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2424f8e35ef23dbd99f4fa39e0c823ee");
        } else {
            getNext().runOnMainSync(runnable);
        }
    }

    @Override // android.app.Instrumentation
    public Activity startActivitySync(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ab268041963b9edbf5e17dda3b671d0", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ab268041963b9edbf5e17dda3b671d0") : getNext().startActivitySync(intent);
    }

    @Override // android.app.Instrumentation
    public void addMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        Object[] objArr = {activityMonitor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78a0f866a5a744589d41a6c897fa5d2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78a0f866a5a744589d41a6c897fa5d2f");
        } else {
            getNext().addMonitor(activityMonitor);
        }
    }

    @Override // android.app.Instrumentation
    public Instrumentation.ActivityMonitor addMonitor(IntentFilter intentFilter, Instrumentation.ActivityResult activityResult, boolean z) {
        Object[] objArr = {intentFilter, activityResult, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11c556403c72a6b9f7dd157a796f3438", RobustBitConfig.DEFAULT_VALUE) ? (Instrumentation.ActivityMonitor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11c556403c72a6b9f7dd157a796f3438") : getNext().addMonitor(intentFilter, activityResult, z);
    }

    @Override // android.app.Instrumentation
    public Instrumentation.ActivityMonitor addMonitor(String str, Instrumentation.ActivityResult activityResult, boolean z) {
        Object[] objArr = {str, activityResult, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3b3e47cc80ca67dd0a6b35f9e718736", RobustBitConfig.DEFAULT_VALUE) ? (Instrumentation.ActivityMonitor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3b3e47cc80ca67dd0a6b35f9e718736") : getNext().addMonitor(str, activityResult, z);
    }

    @Override // android.app.Instrumentation
    public boolean checkMonitorHit(Instrumentation.ActivityMonitor activityMonitor, int i) {
        Object[] objArr = {activityMonitor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b5a4dafaf96e2b62eba03fdc91169b7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b5a4dafaf96e2b62eba03fdc91169b7")).booleanValue() : getNext().checkMonitorHit(activityMonitor, i);
    }

    @Override // android.app.Instrumentation
    public Activity waitForMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        Object[] objArr = {activityMonitor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60e812bac2c3aa45aed398dc9d7625d8", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60e812bac2c3aa45aed398dc9d7625d8") : getNext().waitForMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public Activity waitForMonitorWithTimeout(Instrumentation.ActivityMonitor activityMonitor, long j) {
        Object[] objArr = {activityMonitor, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a35a0581a41f4b842d4fd926139f9e13", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a35a0581a41f4b842d4fd926139f9e13") : getNext().waitForMonitorWithTimeout(activityMonitor, j);
    }

    @Override // android.app.Instrumentation
    public void removeMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        Object[] objArr = {activityMonitor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70c1de543e7d0cc4c78f4d5bc11d288a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70c1de543e7d0cc4c78f4d5bc11d288a");
        } else {
            getNext().removeMonitor(activityMonitor);
        }
    }

    @Override // android.app.Instrumentation
    public boolean invokeMenuActionSync(Activity activity, int i, int i2) {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f68660780ed5f95c543d1acdbf25551", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f68660780ed5f95c543d1acdbf25551")).booleanValue() : getNext().invokeMenuActionSync(activity, i, i2);
    }

    @Override // android.app.Instrumentation
    public boolean invokeContextMenuAction(Activity activity, int i, int i2) {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f22979aad79659f09ece46efe901b84e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f22979aad79659f09ece46efe901b84e")).booleanValue() : getNext().invokeContextMenuAction(activity, i, i2);
    }

    @Override // android.app.Instrumentation
    public void sendStringSync(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3703aac3c62651d16f80f0359e352a82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3703aac3c62651d16f80f0359e352a82");
        } else {
            getNext().sendStringSync(str);
        }
    }

    @Override // android.app.Instrumentation
    public void sendKeySync(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b93189425cc7d627b359adcca50e3cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b93189425cc7d627b359adcca50e3cf");
        } else {
            getNext().sendKeySync(keyEvent);
        }
    }

    @Override // android.app.Instrumentation
    public void sendKeyDownUpSync(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "425d2b65cc5a38d65f2a9b6d8759c54c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "425d2b65cc5a38d65f2a9b6d8759c54c");
        } else {
            getNext().sendKeyDownUpSync(i);
        }
    }

    @Override // android.app.Instrumentation
    public void sendCharacterSync(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "688e55f43c881bc540e64b7b67122bfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "688e55f43c881bc540e64b7b67122bfd");
        } else {
            getNext().sendCharacterSync(i);
        }
    }

    @Override // android.app.Instrumentation
    public void sendPointerSync(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "786a27986dc25f46ed5bcd05ec29537f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "786a27986dc25f46ed5bcd05ec29537f");
        } else {
            getNext().sendPointerSync(motionEvent);
        }
    }

    @Override // android.app.Instrumentation
    public void sendTrackballEventSync(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2404d0ccf603949fe0d540c512465e2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2404d0ccf603949fe0d540c512465e2c");
        } else {
            getNext().sendTrackballEventSync(motionEvent);
        }
    }

    @Override // android.app.Instrumentation
    public Application newApplication(ClassLoader classLoader, String str, Context context) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Object[] objArr = {classLoader, str, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d67242ca4b9de7aa39be3fc97d9be63", RobustBitConfig.DEFAULT_VALUE) ? (Application) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d67242ca4b9de7aa39be3fc97d9be63") : getNext().newApplication(classLoader, str, context);
    }

    @Override // android.app.Instrumentation
    public void callApplicationOnCreate(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa69e8e41060285b0d22555b96e2fa3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa69e8e41060285b0d22555b96e2fa3c");
        } else {
            getNext().callApplicationOnCreate(application);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db31c23c39992d6cf812520a01396b8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db31c23c39992d6cf812520a01396b8a");
        } else {
            getNext().callActivityOnCreate(activity, bundle);
        }
    }

    @Override // android.app.Instrumentation
    @TargetApi(21)
    public void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        Object[] objArr = {activity, bundle, persistableBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9a29598946592cb14d42f142acf4b2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9a29598946592cb14d42f142acf4b2f");
        } else {
            getNext().callActivityOnCreate(activity, bundle, persistableBundle);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnDestroy(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3f479c3d09e174b97869c5d83a81f85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3f479c3d09e174b97869c5d83a81f85");
        } else {
            getNext().callActivityOnDestroy(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfbc28b7af6229fd084d6af07922bc08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfbc28b7af6229fd084d6af07922bc08");
        } else {
            getNext().callActivityOnRestoreInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Instrumentation
    @TargetApi(21)
    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        Object[] objArr = {activity, bundle, persistableBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f99a531a3dc5c732be33e7b93185ebe0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f99a531a3dc5c732be33e7b93185ebe0");
        } else {
            getNext().callActivityOnRestoreInstanceState(activity, bundle, persistableBundle);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPostCreate(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88098184b937d7b90667324a822ce8c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88098184b937d7b90667324a822ce8c0");
        } else {
            getNext().callActivityOnPostCreate(activity, bundle);
        }
    }

    @Override // android.app.Instrumentation
    @TargetApi(21)
    public void callActivityOnPostCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        Object[] objArr = {activity, bundle, persistableBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c869f1e7e2ae4de38eec98c5b6c3cc64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c869f1e7e2ae4de38eec98c5b6c3cc64");
        } else {
            getNext().callActivityOnPostCreate(activity, bundle, persistableBundle);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnNewIntent(Activity activity, Intent intent) {
        Object[] objArr = {activity, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30f13511858803aba45b249354ba0cb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30f13511858803aba45b249354ba0cb2");
        } else {
            getNext().callActivityOnNewIntent(activity, intent);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStart(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89ccbb17f8ad0704e3a63696dcf5fcbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89ccbb17f8ad0704e3a63696dcf5fcbd");
        } else {
            getNext().callActivityOnStart(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestart(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efa13f4f8d28ad0d156af45da2fe860c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efa13f4f8d28ad0d156af45da2fe860c");
        } else {
            getNext().callActivityOnRestart(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnResume(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6687758e71ce9e98354366b76bca596b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6687758e71ce9e98354366b76bca596b");
        } else {
            getNext().callActivityOnResume(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStop(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40fae3cd125d0a15f95f72810e4c4b43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40fae3cd125d0a15f95f72810e4c4b43");
        } else {
            getNext().callActivityOnStop(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1075e2b4a3b888c0b78cd798b8609d3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1075e2b4a3b888c0b78cd798b8609d3a");
        } else {
            getNext().callActivityOnSaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        Object[] objArr = {activity, bundle, persistableBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32d6e3516207c93e2be3970cc5040dee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32d6e3516207c93e2be3970cc5040dee");
        } else {
            super.callActivityOnSaveInstanceState(activity, bundle, persistableBundle);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPause(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2600262a7a051482f40e4f0567c0581b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2600262a7a051482f40e4f0567c0581b");
        } else {
            getNext().callActivityOnPause(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnUserLeaving(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3b490b859915ee204a1015d9ad8e07c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3b490b859915ee204a1015d9ad8e07c");
        } else {
            getNext().callActivityOnUserLeaving(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void startAllocCounting() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "374150c7551b1789eb4ada3b8037d7d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "374150c7551b1789eb4ada3b8037d7d1");
        } else {
            getNext().startAllocCounting();
        }
    }

    @Override // android.app.Instrumentation
    public void stopAllocCounting() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6e85f0d594271c7d8d1ca1cffab7890", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6e85f0d594271c7d8d1ca1cffab7890");
        } else {
            getNext().stopAllocCounting();
        }
    }

    @Override // android.app.Instrumentation
    public Bundle getAllocCounts() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "109c09118f869a96336dfacdcfbc87ad", RobustBitConfig.DEFAULT_VALUE) ? (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "109c09118f869a96336dfacdcfbc87ad") : getNext().getAllocCounts();
    }

    @Override // android.app.Instrumentation
    public Bundle getBinderCounts() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef2489e9bfc2914b7a53e3752f596b40", RobustBitConfig.DEFAULT_VALUE) ? (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef2489e9bfc2914b7a53e3752f596b40") : getNext().getBinderCounts();
    }

    @Override // android.app.Instrumentation
    @TargetApi(18)
    public UiAutomation getUiAutomation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5efc916f7e147c330b5301829cf7cf9", RobustBitConfig.DEFAULT_VALUE) ? (UiAutomation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5efc916f7e147c330b5301829cf7cf9") : getNext().getUiAutomation();
    }

    @Override // android.app.Instrumentation
    public UiAutomation getUiAutomation(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "292052db6df6cf7a8d47d538193ea70d", RobustBitConfig.DEFAULT_VALUE) ? (UiAutomation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "292052db6df6cf7a8d47d538193ea70d") : getNext().getUiAutomation(i);
    }
}
