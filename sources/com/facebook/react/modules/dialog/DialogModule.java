package com.facebook.react.modules.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.c;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = DialogModule.NAME)
/* loaded from: classes.dex */
public class DialogModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";
    static final String KEY_CANCELABLE = "cancelable";
    static final String KEY_ITEMS = "items";
    static final String KEY_MESSAGE = "message";
    static final String KEY_TITLE = "title";
    public static final String NAME = "DialogManagerAndroid";
    private boolean mIsInForeground;
    static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    static final String ACTION_DISMISSED = "dismissed";
    static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    static final Map<String, Object> CONSTANTS = c.a(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED, ACTION_DISMISSED, ACTION_DISMISSED, KEY_BUTTON_POSITIVE, -1, KEY_BUTTON_NEGATIVE, -2, KEY_BUTTON_NEUTRAL, -3);

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    public DialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b {
        @NonNull
        final FragmentManager a;
        @Nullable
        Object b;

        public b(@NonNull FragmentManager fragmentManager) {
            this.a = fragmentManager;
        }

        void a() {
            AlertFragment alertFragment;
            if (DialogModule.this.mIsInForeground && (alertFragment = (AlertFragment) this.a.findFragmentByTag(DialogModule.FRAGMENT_TAG)) != null && alertFragment.isResumed()) {
                alertFragment.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {
        private final Callback b;
        private boolean c = false;

        public a(Callback callback) {
            this.b = callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            if (this.c || !DialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            this.b.invoke(DialogModule.ACTION_BUTTON_CLICKED, Integer.valueOf(i));
            this.c = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            if (this.c || !DialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            this.b.invoke(DialogModule.ACTION_DISMISSED);
            this.c = true;
        }
    }

    public Map<String, Object> getTypedExportedConstants() {
        return CONSTANTS;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mIsInForeground = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mIsInForeground = true;
        b fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            com.facebook.common.logging.a.a(DialogModule.class, "onHostResume called but no FragmentManager found");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        SoftAssertions.assertCondition(DialogModule.this.mIsInForeground, "showPendingAlert() called in background");
        if (fragmentManagerHelper.b != null) {
            fragmentManagerHelper.a();
            ((AlertFragment) fragmentManagerHelper.b).show(fragmentManagerHelper.a, FRAGMENT_TAG);
            fragmentManagerHelper.b = null;
        }
    }

    @ReactMethod
    public void showAlert(ReadableMap readableMap, Callback callback, final Callback callback2) {
        final b fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            callback.invoke("Tried to show an alert while not attached to an Activity");
            return;
        }
        final Bundle bundle = new Bundle();
        if (readableMap.hasKey("title")) {
            bundle.putString("title", readableMap.getString("title"));
        }
        if (readableMap.hasKey("message")) {
            bundle.putString("message", readableMap.getString("message"));
        }
        if (readableMap.hasKey(KEY_BUTTON_POSITIVE)) {
            bundle.putString("button_positive", readableMap.getString(KEY_BUTTON_POSITIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEGATIVE)) {
            bundle.putString("button_negative", readableMap.getString(KEY_BUTTON_NEGATIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEUTRAL)) {
            bundle.putString("button_neutral", readableMap.getString(KEY_BUTTON_NEUTRAL));
        }
        if (readableMap.hasKey(KEY_ITEMS)) {
            ReadableArray array = readableMap.getArray(KEY_ITEMS);
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            for (int i = 0; i < array.size(); i++) {
                charSequenceArr[i] = array.getString(i);
            }
            bundle.putCharSequenceArray(KEY_ITEMS, charSequenceArr);
        }
        if (readableMap.hasKey(KEY_CANCELABLE)) {
            bundle.putBoolean(KEY_CANCELABLE, readableMap.getBoolean(KEY_CANCELABLE));
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.dialog.DialogModule.1
            @Override // java.lang.Runnable
            public final void run() {
                b bVar = fragmentManagerHelper;
                Bundle bundle2 = bundle;
                Callback callback3 = callback2;
                UiThreadUtil.assertOnUiThread();
                bVar.a();
                AlertFragment alertFragment = new AlertFragment(callback3 != null ? new a(callback3) : null, bundle2);
                if (DialogModule.this.mIsInForeground && !bVar.a.isStateSaved()) {
                    if (bundle2.containsKey(DialogModule.KEY_CANCELABLE)) {
                        alertFragment.setCancelable(bundle2.getBoolean(DialogModule.KEY_CANCELABLE));
                    }
                    alertFragment.show(bVar.a, DialogModule.FRAGMENT_TAG);
                    return;
                }
                bVar.b = alertFragment;
            }
        });
    }

    @Nullable
    private b getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof FragmentActivity)) {
            return null;
        }
        return new b(((FragmentActivity) currentActivity).getSupportFragmentManager());
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @javax.annotation.Nullable
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }
}
