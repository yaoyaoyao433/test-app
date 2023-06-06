package com.meituan.android.common.weaver.impl.rules;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.weaver.impl.ffp.CustomTagsEvent;
import com.meituan.android.common.weaver.impl.listener.LFFPTags;
import com.meituan.android.common.weaver.impl.listener.LReport;
import com.meituan.android.common.weaver.impl.natives.NativeFFPEvent;
import com.meituan.android.common.weaver.impl.natives.NativeRouteEvent;
import com.meituan.android.common.weaver.impl.utils.Logger;
import com.meituan.android.common.weaver.interfaces.WeaverEvent;
import com.meituan.android.common.weaver.interfaces.ffp.ContainerEvent;
import com.meituan.android.common.weaver.interfaces.ffp.WithActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ActivityScopeRule implements WeaverRule {
    private static final String BK_LTYPE = "lType";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final List<Finder> mContainerFinders;
    private final List<Finder> mNativeFinders;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface FindEvent {
        boolean onEvent(@NonNull WeaverEvent weaverEvent);
    }

    public ActivityScopeRule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "664e654c681a5906becb73147b28f042", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "664e654c681a5906becb73147b28f042");
            return;
        }
        this.mNativeFinders = Arrays.asList(new CustomFinder(), new NativeRouteFinder());
        this.mContainerFinders = Arrays.asList(new CustomFinder(), new NativeRouteFinder(), new ContainerRouteFinder());
    }

    @Override // com.meituan.android.common.weaver.impl.rules.WeaverRule
    public void consumerEvents(@NonNull LinkedList<WeaverEvent> linkedList) {
        Object[] objArr = {linkedList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcc976e5eb2fe2b1fee86e5d698e3fa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcc976e5eb2fe2b1fee86e5d698e3fa4");
            return;
        }
        Iterator<WeaverEvent> it = linkedList.iterator();
        while (it.hasNext()) {
            WeaverEvent next = it.next();
            if (next instanceof NativeFFPEvent) {
                NativeFFPEvent nativeFFPEvent = (NativeFFPEvent) next;
                if (!nativeFFPEvent.isConsumed && nativeFFPEvent.isEnd()) {
                    nativeFFPEvent.isConsumed = true;
                    process(next, linkedList, this.mNativeFinders);
                }
            } else if (next instanceof ContainerEvent) {
                ContainerEvent containerEvent = (ContainerEvent) next;
                if (!containerEvent.isConsumed && containerEvent.isEnd()) {
                    containerEvent.isConsumed = true;
                    process(next, linkedList, this.mContainerFinders);
                }
            }
        }
    }

    private void process(WeaverEvent weaverEvent, LinkedList<WeaverEvent> linkedList, List<Finder> list) {
        Object[] objArr = {weaverEvent, linkedList, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b18ea2f4758b8caa861adc015e2fd24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b18ea2f4758b8caa861adc015e2fd24");
            return;
        }
        HashMap hashMap = new HashMap();
        if (weaverEvent instanceof NativeFFPEvent) {
            ((NativeFFPEvent) weaverEvent).fillBabelArgs(hashMap);
        } else if (weaverEvent instanceof ContainerEvent) {
            ((ContainerEvent) weaverEvent).fillBabelArgs(hashMap);
        }
        for (Finder finder : list) {
            if (finder.markFindAndReport(weaverEvent, linkedList, hashMap) != null) {
                return;
            }
        }
        Logger.getLogger().d("end Event not find start: ", weaverEvent.toJson());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static abstract class Finder {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Nullable
        public abstract WeaverEvent markFindAndReport(WeaverEvent weaverEvent, LinkedList<WeaverEvent> linkedList, Map<String, Object> map);

        public void report(@NonNull WeaverEvent weaverEvent, @NonNull WeaverEvent weaverEvent2, @NonNull Map<String, Object> map) {
        }

        public Finder() {
        }

        public void report(@NonNull WeaverEvent weaverEvent, @NonNull WeaverEvent weaverEvent2, @NonNull Map<String, Object> map, @NonNull LinkedList<WeaverEvent> linkedList) {
            Object[] objArr = {weaverEvent, weaverEvent2, map, linkedList};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83d133b896513ab8f2ab243bd6aa6de6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83d133b896513ab8f2ab243bd6aa6de6");
                return;
            }
            long createMs = weaverEvent2.createMs() - weaverEvent.createMs();
            Object obj = map.get("fIDelay");
            map.put("ffpStartTS", Long.valueOf(weaverEvent.createMs()));
            if (obj instanceof Number) {
                map.put("originValue", Long.valueOf(createMs));
                createMs -= ((Number) obj).longValue();
            }
            Map<String, Object> ffpTags = new LFFPTags().ffpTags();
            for (String str : ffpTags.keySet()) {
                if (!map.containsKey(str)) {
                    map.put(str, ffpTags.get(str));
                }
            }
            Iterator<WeaverEvent> descendingIterator = linkedList.descendingIterator();
            while (descendingIterator.hasNext()) {
                WeaverEvent next = descendingIterator.next();
                if (next instanceof CustomTagsEvent) {
                    ((CustomTagsEvent) next).patchCustomTag(weaverEvent, weaverEvent2, map);
                }
            }
            Logger.getLogger().d("秒开2.0上报事件, extra=", map, " value=", Long.valueOf(createMs));
            Log.Builder lv4LocalStatus = new Log.Builder("").reportChannel("prism-report-fsp").lv4LocalStatus(true);
            Log.Builder value = lv4LocalStatus.tag("ffp_" + map.get("tType")).optional(map).value(createMs);
            if (createMs <= 0) {
                value.generalChannelStatus(true);
                value.tag("ffp_value_negative");
            }
            Babel.logRT(value.build());
            report(weaverEvent, weaverEvent2, map);
            LReport.report(weaverEvent.createMs(), weaverEvent2.createMs(), map, createMs);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class CustomFinder extends Finder {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.meituan.android.common.weaver.impl.rules.ActivityScopeRule.Finder
        @Nullable
        public WeaverEvent markFindAndReport(WeaverEvent weaverEvent, LinkedList<WeaverEvent> linkedList, Map<String, Object> map) {
            return null;
        }

        public CustomFinder() {
            super();
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90df24f3eb7f9aa750a42f5aebd22ca1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90df24f3eb7f9aa750a42f5aebd22ca1");
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class NativeRouteFinder extends Finder {
        public static ChangeQuickRedirect changeQuickRedirect;

        public NativeRouteFinder() {
            super();
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d34f381bd7f253237ba4531014d7430c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d34f381bd7f253237ba4531014d7430c");
            }
        }

        @Override // com.meituan.android.common.weaver.impl.rules.ActivityScopeRule.Finder
        @Nullable
        public WeaverEvent markFindAndReport(WeaverEvent weaverEvent, LinkedList<WeaverEvent> linkedList, Map<String, Object> map) {
            Object[] objArr = {weaverEvent, linkedList, map};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf0dc790f200f19b4ef7ec02c49f812d", RobustBitConfig.DEFAULT_VALUE)) {
                return (WeaverEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf0dc790f200f19b4ef7ec02c49f812d");
            }
            final String activity = ((WithActivity) weaverEvent).activity();
            if ((weaverEvent instanceof ContainerEvent) && ((ContainerEvent) weaverEvent).shouldIgnoreNativeCreate()) {
                return null;
            }
            final ArrayList<NativeRouteEvent> arrayList = new ArrayList();
            final NativeRouteEvent[] nativeRouteEventArr = new NativeRouteEvent[2];
            ActivityScopeRule.forEach(weaverEvent, linkedList, new FindEvent() { // from class: com.meituan.android.common.weaver.impl.rules.ActivityScopeRule.NativeRouteFinder.1
                public static ChangeQuickRedirect changeQuickRedirect;
                private NativeRouteEvent mOnCreateEvent;

                @Override // com.meituan.android.common.weaver.impl.rules.ActivityScopeRule.FindEvent
                public boolean onEvent(@NonNull WeaverEvent weaverEvent2) {
                    Object[] objArr2 = {weaverEvent2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7b2714325c89eeb516dc91d2b2c81bf9", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7b2714325c89eeb516dc91d2b2c81bf9")).booleanValue();
                    }
                    if (weaverEvent2 instanceof NativeRouteEvent) {
                        NativeRouteEvent nativeRouteEvent = (NativeRouteEvent) weaverEvent2;
                        if (!nativeRouteEvent.isConsumed) {
                            if (NativeRouteEvent.TYPE_START.equals(weaverEvent2.getType())) {
                                if (this.mOnCreateEvent != null && nativeRouteEvent.isStartEventOfActivity(this.mOnCreateEvent)) {
                                    arrayList.add(nativeRouteEvent);
                                    nativeRouteEventArr[0] = nativeRouteEvent;
                                    return true;
                                }
                            } else if (TextUtils.equals(activity, nativeRouteEvent.activity())) {
                                if (NativeRouteEvent.TYPE_CREATE.equals(weaverEvent2.getType())) {
                                    this.mOnCreateEvent = nativeRouteEvent;
                                    nativeRouteEventArr[1] = this.mOnCreateEvent;
                                }
                                arrayList.add(nativeRouteEvent);
                            }
                        }
                    }
                    return false;
                }
            });
            WeaverEvent weaverEvent2 = nativeRouteEventArr[0];
            if (weaverEvent2 != null) {
                map.put(ActivityScopeRule.BK_LTYPE, "nStart");
            } else {
                NativeRouteEvent nativeRouteEvent = nativeRouteEventArr[1];
                if (nativeRouteEvent != null) {
                    map.put(ActivityScopeRule.BK_LTYPE, "nOnCreate");
                }
                weaverEvent2 = nativeRouteEvent;
            }
            if (weaverEvent2 != null) {
                for (NativeRouteEvent nativeRouteEvent2 : arrayList) {
                    nativeRouteEvent2.isConsumed = true;
                }
                report(weaverEvent2, weaverEvent, map, linkedList);
            }
            return weaverEvent2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class ContainerRouteFinder extends Finder {
        public static ChangeQuickRedirect changeQuickRedirect;

        public ContainerRouteFinder() {
            super();
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f77ed44863c9d0b68725e502bc87f6f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f77ed44863c9d0b68725e502bc87f6f");
            }
        }

        @Override // com.meituan.android.common.weaver.impl.rules.ActivityScopeRule.Finder
        @Nullable
        public WeaverEvent markFindAndReport(WeaverEvent weaverEvent, LinkedList<WeaverEvent> linkedList, Map<String, Object> map) {
            Object[] objArr = {weaverEvent, linkedList, map};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67c9279c9e9978032bd2143b31e3f8f6", RobustBitConfig.DEFAULT_VALUE)) {
                return (WeaverEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67c9279c9e9978032bd2143b31e3f8f6");
            }
            if (weaverEvent instanceof ContainerEvent) {
                final ContainerEvent containerEvent = (ContainerEvent) weaverEvent;
                final ArrayList<ContainerEvent> arrayList = new ArrayList();
                final ContainerEvent[] containerEventArr = new ContainerEvent[1];
                ActivityScopeRule.forEach(containerEvent, linkedList, new FindEvent() { // from class: com.meituan.android.common.weaver.impl.rules.ActivityScopeRule.ContainerRouteFinder.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.weaver.impl.rules.ActivityScopeRule.FindEvent
                    public boolean onEvent(@NonNull WeaverEvent weaverEvent2) {
                        Object[] objArr2 = {weaverEvent2};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "606634785a2e48c199f2b5e5e025db7c", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "606634785a2e48c199f2b5e5e025db7c")).booleanValue();
                        }
                        if (weaverEvent2 instanceof ContainerEvent) {
                            ContainerEvent containerEvent2 = (ContainerEvent) weaverEvent2;
                            if (!containerEvent2.isConsumed && containerEvent.isSamePage(containerEvent2)) {
                                arrayList.add(containerEvent2);
                                if (containerEvent2.isCreate()) {
                                    containerEventArr[0] = containerEvent2;
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                });
                for (ContainerEvent containerEvent2 : arrayList) {
                    containerEvent2.isConsumed = true;
                }
                if (containerEventArr[0] != null) {
                    map.put(ActivityScopeRule.BK_LTYPE, containerEventArr[0].getType());
                    report(containerEventArr[0], containerEvent, map, linkedList);
                    return containerEventArr[0];
                }
                Map<String, Object> map2 = containerEvent.getMap();
                if (containerEvent.getType().contains(ContainerEvent.CONTAINER_NAME_KNB) && map2 != null && map2.containsKey("pageNavStart")) {
                    final Object obj = map2.get("pageNavStart");
                    if (obj instanceof Number) {
                        WeaverEvent weaverEvent2 = new WeaverEvent() { // from class: com.meituan.android.common.weaver.impl.rules.ActivityScopeRule.ContainerRouteFinder.2
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // com.meituan.android.common.weaver.interfaces.WeaverEvent
                            public void fromJson(@NonNull String str, @NonNull JSONObject jSONObject, long j) {
                            }

                            @Override // com.meituan.android.common.weaver.interfaces.WeaverEvent
                            @NonNull
                            public String getType() {
                                return "FAKE";
                            }

                            @Override // com.meituan.android.common.weaver.interfaces.WeaverEvent
                            @NonNull
                            public JSONObject toJson() {
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "82442b6b51c98804d0cebeef99f65deb", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "82442b6b51c98804d0cebeef99f65deb") : new JSONObject();
                            }

                            @Override // com.meituan.android.common.weaver.interfaces.WeaverEvent
                            public long createMs() {
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aeb8b0afbeddb86bbcb69ba57d659561", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aeb8b0afbeddb86bbcb69ba57d659561")).longValue() : ((Number) obj).longValue();
                            }
                        };
                        map.put(ActivityScopeRule.BK_LTYPE, "pageNavStart");
                        report(weaverEvent2, containerEvent, map, linkedList);
                    }
                }
                return null;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void forEach(WeaverEvent weaverEvent, LinkedList<WeaverEvent> linkedList, @NonNull FindEvent findEvent) {
        boolean z = false;
        Object[] objArr = {weaverEvent, linkedList, findEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6537e03d00a72c765b8d923ae53652cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6537e03d00a72c765b8d923ae53652cf");
            return;
        }
        Iterator<WeaverEvent> descendingIterator = linkedList.descendingIterator();
        while (descendingIterator.hasNext()) {
            WeaverEvent next = descendingIterator.next();
            if (next == weaverEvent) {
                z = true;
            }
            if (z && findEvent.onEvent(next)) {
                return;
            }
        }
    }
}
