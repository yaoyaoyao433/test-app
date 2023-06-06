package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes.dex */
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {
    private static final String EXTRA_WAKE_LOCK_ID = "android.support.content.wakelockid";
    private static final SparseArray<PowerManager.WakeLock> sActiveWakeLocks = new SparseArray<>();
    private static int mNextId = 1;

    public static ComponentName startWakefulService(Context context, Intent intent) {
        synchronized (sActiveWakeLocks) {
            int i = mNextId;
            int i2 = mNextId + 1;
            mNextId = i2;
            if (i2 <= 0) {
                mNextId = 1;
            }
            intent.putExtra(EXTRA_WAKE_LOCK_ID, i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(LocationStrategy.LOCATION_TIMEOUT);
            sActiveWakeLocks.put(i, newWakeLock);
            return startService;
        }
    }

    public static boolean completeWakefulIntent(Intent intent) {
        int a = f.a(intent, EXTRA_WAKE_LOCK_ID, 0);
        if (a == 0) {
            return false;
        }
        synchronized (sActiveWakeLocks) {
            PowerManager.WakeLock wakeLock = sActiveWakeLocks.get(a);
            if (wakeLock != null) {
                wakeLock.release();
                sActiveWakeLocks.remove(a);
                return true;
            }
            new StringBuilder("No active wake lock id #").append(a);
            return true;
        }
    }
}
