package com.tencent.liteav.audio;

import com.tencent.liteav.basic.log.TXCLog;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    private HashMap<String, HashSet<Integer>> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.tencent.liteav.audio.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1440a {
        private static final a a = new a();
    }

    public static a a() {
        return C1440a.a;
    }

    private a() {
        this.a = new HashMap<>();
    }

    public void a(String str, boolean z, int i) {
        HashSet<Integer> hashSet = this.a.get(str);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.a.put(str, hashSet);
        }
        hashSet.add(Integer.valueOf(i));
        TXCAudioEngine.getInstance().startRemoteAudio(str, z);
        TXCLog.i("AudioPlayManager", "startRemoteAudio tinyId:" + str + ", sessionId:" + i);
    }

    public void a(String str, int i) {
        HashSet<Integer> hashSet = this.a.get(str);
        if (hashSet == null) {
            return;
        }
        hashSet.remove(Integer.valueOf(i));
        if (hashSet.isEmpty()) {
            this.a.remove(str);
            TXCAudioEngine.getInstance().stopRemoteAudio(str);
            TXCLog.i("AudioPlayManager", "stopRemoteAudio. tinyId:" + str + ", sessionId:" + i);
            return;
        }
        TXCLog.i("AudioPlayManager", "ignore stopRemoteAudio. because the same user is playing in other session. tinyId:" + str + ", cur sessionId:" + i + ", other sessionId:" + hashSet.iterator().next().intValue());
    }

    public void a(int i) {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, HashSet<Integer>> entry : this.a.entrySet()) {
            String key = entry.getKey();
            HashSet<Integer> value = entry.getValue();
            value.remove(Integer.valueOf(i));
            if (value.isEmpty()) {
                hashSet.add(key);
                TXCAudioEngine.getInstance().stopRemoteAudio(key);
                TXCLog.i("AudioPlayManager", "stopPlay, tinyId:" + key);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.a.remove((String) it.next());
        }
    }
}
