package dianping.com.nvlinker.horn;

import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import dianping.com.nvlinker.stub.IHorn;
import dianping.com.nvlinker.stub.IHornCallback;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class NVLinkerHorn implements IHorn {
    public static NVLinkerHorn obtain() {
        return new NVLinkerHorn();
    }

    @Override // dianping.com.nvlinker.stub.IHorn
    public String accessCache(String str) {
        return Horn.accessCache(str);
    }

    @Override // dianping.com.nvlinker.stub.IHorn
    public void register(String str, final IHornCallback iHornCallback) {
        Horn.register(str, new HornCallback() { // from class: dianping.com.nvlinker.horn.NVLinkerHorn.1
            @Override // com.meituan.android.common.horn.HornCallback
            public void onChanged(boolean z, String str2) {
                iHornCallback.onChanged(z, str2);
            }
        });
    }
}
