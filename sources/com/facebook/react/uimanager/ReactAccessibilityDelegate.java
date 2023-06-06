package com.facebook.react.uimanager;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ReactAccessibilityDelegate extends AccessibilityDelegateCompat {
    public static final HashMap<String, Integer> a;
    private static int b = 1056964608;
    private final HashMap<Integer, String> d = new HashMap<>();
    private Handler c = new Handler() { // from class: com.facebook.react.uimanager.ReactAccessibilityDelegate.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            ((View) message.obj).sendAccessibilityEvent(4);
        }
    };

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        a = hashMap;
        hashMap.put("activate", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK.getId()));
        a.put("longpress", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_LONG_CLICK.getId()));
        a.put("increment", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD.getId()));
        a.put("decrement", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD.getId()));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        NONE,
        BUTTON,
        LINK,
        SEARCH,
        IMAGE,
        IMAGEBUTTON,
        KEYBOARDKEY,
        TEXT,
        ADJUSTABLE,
        SUMMARY,
        HEADER,
        ALERT,
        CHECKBOX,
        COMBOBOX,
        MENU,
        MENUBAR,
        MENUITEM,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        SCROLLBAR,
        SPINBUTTON,
        SWITCH,
        TAB,
        TABLIST,
        TIMER,
        TOOLBAR;

        public static String a(a aVar) {
            switch (aVar) {
                case BUTTON:
                    return "android.widget.Button";
                case SEARCH:
                    return "android.widget.EditText";
                case IMAGE:
                    return "android.widget.ImageView";
                case IMAGEBUTTON:
                    return "android.widget.ImageButon";
                case KEYBOARDKEY:
                    return "android.inputmethodservice.Keyboard$Key";
                case TEXT:
                    return "android.widget.TextView";
                case ADJUSTABLE:
                    return "android.widget.SeekBar";
                case CHECKBOX:
                    return "android.widget.CheckBox";
                case RADIO:
                    return "android.widget.RadioButton";
                case SPINBUTTON:
                    return "android.widget.SpinButton";
                case SWITCH:
                    return "android.widget.Switch";
                case NONE:
                case LINK:
                case SUMMARY:
                case HEADER:
                case ALERT:
                case COMBOBOX:
                case MENU:
                case MENUBAR:
                case MENUITEM:
                case PROGRESSBAR:
                case RADIOGROUP:
                case SCROLLBAR:
                case TAB:
                case TABLIST:
                case TIMER:
                case TOOLBAR:
                    return "android.view.View";
                default:
                    throw new IllegalArgumentException("Invalid accessibility role value: " + aVar);
            }
        }

        public static a a(@Nullable String str) {
            a[] values;
            for (a aVar : values()) {
                if (aVar.name().equalsIgnoreCase(str)) {
                    return aVar;
                }
            }
            throw new IllegalArgumentException("Invalid accessibility role value: " + str);
        }
    }

    @Override // android.support.v4.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        a aVar = (a) view.getTag(R.id.accessibility_role);
        if (aVar != null) {
            Context context = view.getContext();
            if (aVar == null) {
                aVar = a.NONE;
            }
            accessibilityNodeInfoCompat.setClassName(a.a(aVar));
            if (aVar.equals(a.LINK)) {
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(R.string.link_description));
                if (accessibilityNodeInfoCompat.getContentDescription() != null) {
                    SpannableString spannableString = new SpannableString(accessibilityNodeInfoCompat.getContentDescription());
                    spannableString.setSpan(new URLSpan(""), 0, spannableString.length(), 0);
                    accessibilityNodeInfoCompat.setContentDescription(spannableString);
                }
                if (accessibilityNodeInfoCompat.getText() != null) {
                    SpannableString spannableString2 = new SpannableString(accessibilityNodeInfoCompat.getText());
                    spannableString2.setSpan(new URLSpan(""), 0, spannableString2.length(), 0);
                    accessibilityNodeInfoCompat.setText(spannableString2);
                }
            } else if (aVar.equals(a.SEARCH)) {
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(R.string.search_description));
            } else if (aVar.equals(a.IMAGE)) {
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(R.string.image_description));
            } else if (aVar.equals(a.IMAGEBUTTON)) {
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(R.string.imagebutton_description));
                accessibilityNodeInfoCompat.setClickable(true);
            } else if (aVar.equals(a.BUTTON)) {
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(R.string.button_description));
                accessibilityNodeInfoCompat.setClickable(true);
            } else if (aVar.equals(a.SUMMARY)) {
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(R.string.summary_description));
            } else if (aVar.equals(a.HEADER)) {
                accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, 0, 1, true));
            } else if (aVar.equals(a.ALERT)) {
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(R.string.alert_description));
            } else if (aVar.equals(a.COMBOBOX)) {
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(R.string.combobox_description));
            } else if (aVar.equals(a.MENU)) {
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(R.string.menu_description));
            } else if (aVar.equals(a.MENUBAR)) {
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(R.string.menubar_description));
            } else if (aVar.equals(a.MENUITEM)) {
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(R.string.menuitem_description));
            } else if (aVar.equals(a.PROGRESSBAR)) {
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(R.string.progressbar_description));
            } else if (aVar.equals(a.RADIOGROUP)) {
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(R.string.radiogroup_description));
            } else if (aVar.equals(a.SCROLLBAR)) {
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(R.string.scrollbar_description));
            } else if (aVar.equals(a.SPINBUTTON)) {
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(R.string.spinbutton_description));
            } else if (aVar.equals(a.TAB)) {
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(R.string.rn_tab_description));
            } else if (aVar.equals(a.TABLIST)) {
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(R.string.tablist_description));
            } else if (aVar.equals(a.TIMER)) {
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(R.string.timer_description));
            } else if (aVar.equals(a.TOOLBAR)) {
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(R.string.toolbar_description));
            }
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_state);
        if (readableMap != null) {
            a(accessibilityNodeInfoCompat, readableMap, view.getContext());
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(R.id.accessibility_actions);
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                ReadableMap map = readableArray.getMap(i);
                if (!map.hasKey("name")) {
                    throw new IllegalArgumentException("Unknown accessibility action.");
                }
                int i2 = b;
                String string = map.hasKey("label") ? map.getString("label") : null;
                if (a.containsKey(map.getString("name"))) {
                    i2 = a.get(map.getString("name")).intValue();
                } else {
                    b++;
                }
                this.d.put(Integer.valueOf(i2), map.getString("name"));
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i2, string));
            }
        }
        ReadableMap readableMap2 = (ReadableMap) view.getTag(R.id.accessibility_value);
        if (readableMap2 != null && readableMap2.hasKey("min") && readableMap2.hasKey("now") && readableMap2.hasKey("max")) {
            Dynamic dynamic = readableMap2.getDynamic("min");
            Dynamic dynamic2 = readableMap2.getDynamic("now");
            Dynamic dynamic3 = readableMap2.getDynamic("max");
            if (dynamic == null || dynamic.getType() != ReadableType.Number || dynamic2 == null || dynamic2.getType() != ReadableType.Number || dynamic3 == null || dynamic3.getType() != ReadableType.Number) {
                return;
            }
            int asInt = dynamic.asInt();
            int asInt2 = dynamic2.asInt();
            int asInt3 = dynamic3.asInt();
            if (asInt3 <= asInt || asInt2 < asInt || asInt3 < asInt2) {
                return;
            }
            accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(0, asInt, asInt3, asInt2));
        }
    }

    @Override // android.support.v4.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_value);
        if (readableMap != null && readableMap.hasKey("min") && readableMap.hasKey("now") && readableMap.hasKey("max")) {
            Dynamic dynamic = readableMap.getDynamic("min");
            Dynamic dynamic2 = readableMap.getDynamic("now");
            Dynamic dynamic3 = readableMap.getDynamic("max");
            if (dynamic == null || dynamic.getType() != ReadableType.Number || dynamic2 == null || dynamic2.getType() != ReadableType.Number || dynamic3 == null || dynamic3.getType() != ReadableType.Number) {
                return;
            }
            int asInt = dynamic.asInt();
            int asInt2 = dynamic2.asInt();
            int asInt3 = dynamic3.asInt();
            if (asInt3 <= asInt || asInt2 < asInt || asInt3 < asInt2) {
                return;
            }
            accessibilityEvent.setItemCount(asInt3 - asInt);
            accessibilityEvent.setCurrentItemIndex(asInt2);
        }
    }

    @Override // android.support.v4.view.AccessibilityDelegateCompat
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (this.d.containsKey(Integer.valueOf(i))) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("actionName", this.d.get(Integer.valueOf(i)));
            ReactContext reactContext = (ReactContext) view.getContext();
            if (reactContext.hasActiveCatalystInstance()) {
                ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(view.getId(), "topAccessibilityAction", createMap);
            } else {
                ReactSoftException.logSoftException("ReactAccessibilityDelegate", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
            }
            a aVar = (a) view.getTag(R.id.accessibility_role);
            ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_value);
            if (aVar == a.ADJUSTABLE && (i == AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD.getId() || i == AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD.getId())) {
                if (readableMap != null && !readableMap.hasKey("text")) {
                    if (this.c.hasMessages(1, view)) {
                        this.c.removeMessages(1, view);
                    }
                    this.c.sendMessageDelayed(this.c.obtainMessage(1, view), 200L);
                }
                return super.performAccessibilityAction(view, i, bundle);
            }
            return true;
        }
        return super.performAccessibilityAction(view, i, bundle);
    }

    private static void a(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, ReadableMap readableMap, Context context) {
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(nextKey);
            if (nextKey.equals(DMKeys.KEY_SELECTED) && dynamic.getType() == ReadableType.Boolean) {
                accessibilityNodeInfoCompat.setSelected(dynamic.asBoolean());
            } else if (nextKey.equals("disabled") && dynamic.getType() == ReadableType.Boolean) {
                accessibilityNodeInfoCompat.setEnabled(!dynamic.asBoolean());
            } else if (nextKey.equals("checked") && dynamic.getType() == ReadableType.Boolean) {
                boolean asBoolean = dynamic.asBoolean();
                accessibilityNodeInfoCompat.setCheckable(true);
                accessibilityNodeInfoCompat.setChecked(asBoolean);
                if (accessibilityNodeInfoCompat.getClassName().equals(a.a(a.SWITCH))) {
                    accessibilityNodeInfoCompat.setText(context.getString(asBoolean ? R.string.state_on_description : R.string.state_off_description));
                }
            }
        }
    }

    public static void a(View view) {
        if (ViewCompat.hasAccessibilityDelegate(view)) {
            return;
        }
        if (view.getTag(R.id.accessibility_role) == null && view.getTag(R.id.accessibility_state) == null && view.getTag(R.id.accessibility_actions) == null) {
            return;
        }
        ViewCompat.setAccessibilityDelegate(view, new ReactAccessibilityDelegate());
    }
}
