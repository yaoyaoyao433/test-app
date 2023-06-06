package com.dianping.nvnetwork.mol;

import android.support.annotation.Keep;
import com.dianping.nvnetwork.g;
import com.dianping.nvnetwork.h;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes.dex */
public class RPCTask {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static ConcurrentHashMap<String, a> waitingList = new ConcurrentHashMap<>();
    private static Gson gson = new Gson();
    private static double sampleRatio = 0.001d;

    public static boolean isSample(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "69e6fc8fbf77277009a5c8d6679b3393", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "69e6fc8fbf77277009a5c8d6679b3393")).booleanValue();
        }
        if (str == null) {
            return false;
        }
        double d = h.h().aj;
        sampleRatio = d;
        return d >= 1.0d || g.p() || ((double) (Math.abs(str.hashCode()) % 1000000)) / 1000000.0d < sampleRatio;
    }

    public static void removeReq(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "416b0b5361e4c07fb5f9039cad09d970", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "416b0b5361e4c07fb5f9039cad09d970");
        } else {
            waitingList.remove(str);
        }
    }

    public static void startSession(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "35f0b30458d3fd2a54f33058eb07f56e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "35f0b30458d3fd2a54f33058eb07f56e");
        } else if (waitingList.contains(str)) {
        } else {
            a aVar = new a();
            aVar.b = str;
            aVar.e = time();
            waitingList.put(str, aVar);
        }
    }

    public static void startReq(String str, int i) {
        a aVar;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d3ecab8b191e2a5e6673264be0503c70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d3ecab8b191e2a5e6673264be0503c70");
        } else if (waitingList.containsKey(str) && (aVar = waitingList.get(str)) != null) {
            aVar.c = i;
            aVar.f = time();
            waitingList.put(str, aVar);
        }
    }

    public static void write(String str) {
        a aVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ee01667fe7cf1293067e13ed1143f639", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ee01667fe7cf1293067e13ed1143f639");
        } else if (waitingList.containsKey(str) && (aVar = waitingList.get(str)) != null) {
            aVar.g = time();
        }
    }

    public static void ackReq(String str) {
        a aVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5a24ec932d610842135f2f8aa0d0c8f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5a24ec932d610842135f2f8aa0d0c8f1");
        } else if (waitingList.containsKey(str) && (aVar = waitingList.get(str)) != null) {
            aVar.i = time();
        }
    }

    public static void ackReqTimeout(String str) {
        a aVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "458b42462877f6dd3c4a02a93ee639a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "458b42462877f6dd3c4a02a93ee639a1");
        } else if (waitingList.containsKey(str) && (aVar = waitingList.get(str)) != null) {
            aVar.j = time();
        }
    }

    public static void finReq(String str, String str2) {
        a aVar;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e9ebca58c8e91feea8e3648d1f8c6535", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e9ebca58c8e91feea8e3648d1f8c6535");
        } else if (!waitingList.containsKey(str) || (aVar = waitingList.get(str)) == null || aVar.k) {
        } else {
            aVar.k = true;
            aVar.a = str2;
            aVar.h = time();
        }
    }

    public static void failedReq(String str, String str2, int i, long j) {
        a aVar;
        Object[] objArr = {str, str2, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e10b7f020e2bf1ce220945382a6c05b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e10b7f020e2bf1ce220945382a6c05b5");
        } else if (!waitingList.containsKey(str) || (aVar = waitingList.get(str)) == null || aVar.k) {
        } else {
            aVar.k = true;
            aVar.a = str2;
            aVar.d = i;
            aVar.h = j;
        }
    }

    public static void cancelReq(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dc6f671f53574ee9bab6aa53ce4b19b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dc6f671f53574ee9bab6aa53ce4b19b8");
        } else if (waitingList.containsKey(str)) {
            a aVar = waitingList.get(str);
            if (aVar.k) {
                return;
            }
            aVar.k = true;
            aVar.a = str2;
            aVar.d = -1;
            aVar.h = time();
        }
    }

    public static String getSharkInfo(String str) {
        a remove;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "19cb3b343b050bb9c722c216a1e8cf1d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "19cb3b343b050bb9c722c216a1e8cf1d");
        }
        if (waitingList.containsKey(str) && (remove = waitingList.remove(str)) != null) {
            if (remove.d <= 0 || remove.i <= 0 || isSample(str)) {
                RequestEvent requestEvent = new RequestEvent();
                requestEvent.addStep(new Step(301, remove.e, (int) (remove.f - remove.e), 1));
                requestEvent.addSide(new Side(101, remove.f, 0));
                if (remove.i != 0 && remove.j == 0) {
                    requestEvent.addStep(new Step(302, remove.g, (int) (remove.i - remove.g), 1));
                } else {
                    requestEvent.addStep(new Step(302, remove.g, (int) (remove.j - remove.g), -4));
                }
                if (remove.d != -1) {
                    requestEvent.addSide(new Side(102, remove.h, 1));
                } else {
                    requestEvent.addStep(new Step(303, remove.f, (int) (remove.h - remove.f), -5));
                }
                HashMap hashMap = new HashMap();
                hashMap.put("f", "sk");
                hashMap.put("id", str);
                hashMap.put("i", requestEvent);
                String json = gson.toJson(hashMap);
                if (g.p()) {
                    com.dianping.nvnetwork.util.g.a("mol_skinfo", json);
                }
                return json;
            }
            return "";
        }
        return "";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public String a;
        public String b;
        public int c;
        public int d;
        public long e;
        public long f;
        public long g;
        public long h;
        public long i;
        public long j;
        public boolean k;

        public a() {
            this.d = Integer.MAX_VALUE;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes.dex */
    public static class RequestEvent {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("es")
        public List<Side> sides;
        @SerializedName("ps")
        public List<Step> steps;

        public RequestEvent() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40dd1dd2ec5a0bcd8120e86464eed3d4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40dd1dd2ec5a0bcd8120e86464eed3d4");
                return;
            }
            this.steps = new ArrayList();
            this.sides = new ArrayList();
        }

        public void addStep(Step step) {
            Object[] objArr = {step};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b0f2985596f67de025bfc9cd0e5e703", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b0f2985596f67de025bfc9cd0e5e703");
            } else {
                this.steps.add(step);
            }
        }

        public void addSide(Side side) {
            Object[] objArr = {side};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb2187fcfe51ee0281fa10714b480c16", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb2187fcfe51ee0281fa10714b480c16");
            } else {
                this.sides.add(side);
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes.dex */
    public static class Step {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("d")
        public int duration;
        @SerializedName("t")
        public long start;
        @SerializedName("s")
        public int status;
        @SerializedName("i")
        public int stepId;

        public Step(int i, long j, int i2, int i3) {
            this.stepId = i;
            this.start = j;
            this.duration = i2;
            this.status = i3;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes.dex */
    public static class Side {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("d")
        public int side;
        @SerializedName("t")
        public long start;
        @SerializedName("i")
        public int stepId;

        public Side(int i, long j, int i2) {
            this.stepId = i;
            this.start = j;
            this.side = i2;
        }
    }

    public static long time() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5a3f066e536546e8ed58303fe903fb82", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5a3f066e536546e8ed58303fe903fb82")).longValue() : System.currentTimeMillis();
    }
}
