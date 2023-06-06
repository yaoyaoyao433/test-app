package com.meituan.msc.uimanager;

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
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.jse.bridge.ReactSoftException;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.ReadableMapKeySetIterator;
import com.meituan.msc.jse.bridge.ReadableType;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ReactAccessibilityDelegate extends AccessibilityDelegateCompat {
    public static ChangeQuickRedirect a = null;
    public static final HashMap<String, Integer> b;
    private static int c = 1056964608;
    private Handler d;
    private final HashMap<Integer, String> e;

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put("activate", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK.getId()));
        b.put("longpress", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_LONG_CLICK.getId()));
        b.put("increment", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD.getId()));
        b.put("decrement", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD.getId()));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
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
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64d0080a84bbbca51feea524ce576857", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64d0080a84bbbca51feea524ce576857");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f124efa03bc6c4388c4b0d0eeee6943", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f124efa03bc6c4388c4b0d0eeee6943") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1dcaa8c9c2a031f1f9d11b77f8bac0a2", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1dcaa8c9c2a031f1f9d11b77f8bac0a2") : (a[]) values().clone();
        }

        public static String a(a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4016bd161de98aa431bdf17fcc7419f", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4016bd161de98aa431bdf17fcc7419f");
            }
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
            a[] valuesCustom;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "468b8df667f2546a628b46b6ada0b48c", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "468b8df667f2546a628b46b6ada0b48c");
            }
            for (a aVar : valuesCustom()) {
                if (aVar.name().equalsIgnoreCase(str)) {
                    return aVar;
                }
            }
            throw new IllegalArgumentException("Invalid accessibility role value: " + str);
        }
    }

    public ReactAccessibilityDelegate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c76be7ba8dd587458de8a81b86a00d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c76be7ba8dd587458de8a81b86a00d4");
            return;
        }
        this.e = new HashMap<>();
        this.d = new Handler() { // from class: com.meituan.msc.uimanager.ReactAccessibilityDelegate.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ca0dce37f731824b19e233b012a8b38", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ca0dce37f731824b19e233b012a8b38");
                } else {
                    ((View) message.obj).sendAccessibilityEvent(4);
                }
            }
        };
    }

    @Override // android.support.v4.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Object[] objArr = {view, accessibilityNodeInfoCompat};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff8e0089948b96e61de1663a4b09839f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff8e0089948b96e61de1663a4b09839f");
            return;
        }
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        a aVar = (a) view.getTag(R.id.accessibility_role);
        if (aVar != null) {
            Context context = view.getContext();
            Object[] objArr2 = {accessibilityNodeInfoCompat, aVar, context};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a175cc59c02c05bffe12d7fc26b107fb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a175cc59c02c05bffe12d7fc26b107fb");
            } else {
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
                int i2 = c;
                String string = map.hasKey("label") ? map.getString("label") : null;
                if (b.containsKey(map.getString("name"))) {
                    i2 = b.get(map.getString("name")).intValue();
                } else {
                    c++;
                }
                this.e.put(Integer.valueOf(i2), map.getString("name"));
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
        Object[] objArr = {view, accessibilityEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3199f6d253b2a5e5ad2ad86994089703", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3199f6d253b2a5e5ad2ad86994089703");
            return;
        }
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
        Object[] objArr = {view, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdb7b96d1a0d44d57de323380d9bcd4a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdb7b96d1a0d44d57de323380d9bcd4a")).booleanValue();
        }
        if (this.e.containsKey(Integer.valueOf(i))) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("actionName", this.e.get(Integer.valueOf(i)));
            ReactContext reactContext = (ReactContext) view.getContext();
            if (reactContext.hasActiveCatalystInstance()) {
                ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(reactContext.getRuntimeDelegate().getPageId(), view.getId(), "topAccessibilityAction", createMap);
            } else {
                ReactSoftException.logSoftException("ReactAccessibilityDelegate", new com.meituan.msc.exception.b("Cannot get RCTEventEmitter, no CatalystInstance"));
            }
            a aVar = (a) view.getTag(R.id.accessibility_role);
            ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_value);
            if (aVar == a.ADJUSTABLE && (i == AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD.getId() || i == AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD.getId())) {
                if (readableMap != null && !readableMap.hasKey("text")) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f31a482bae044ad369a09de08209db67", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f31a482bae044ad369a09de08209db67");
                    } else {
                        if (this.d.hasMessages(1, view)) {
                            this.d.removeMessages(1, view);
                        }
                        this.d.sendMessageDelayed(this.d.obtainMessage(1, view), 200L);
                    }
                }
                return super.performAccessibilityAction(view, i, bundle);
            }
            return true;
        }
        return super.performAccessibilityAction(view, i, bundle);
    }

    private static void a(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, ReadableMap readableMap, Context context) {
        Object[] objArr = {accessibilityNodeInfoCompat, readableMap, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce89f2ba364964a2f283ae408c209552", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce89f2ba364964a2f283ae408c209552");
            return;
        }
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
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1541bceeb474f4fa4f588946150583ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1541bceeb474f4fa4f588946150583ab");
        } else if (ViewCompat.hasAccessibilityDelegate(view)) {
        } else {
            if (view.getTag(R.id.accessibility_role) == null && view.getTag(R.id.accessibility_state) == null && view.getTag(R.id.accessibility_actions) == null) {
                return;
            }
            ViewCompat.setAccessibilityDelegate(view, new ReactAccessibilityDelegate());
        }
    }
}
