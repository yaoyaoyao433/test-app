package com.meituan.android.walle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private final List<b> b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f6685025a494f77e636feeac3b6608a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f6685025a494f77e636feeac3b6608a");
        } else {
            this.b = new ArrayList();
        }
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30474b6e47110d7910bb297cec5758ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30474b6e47110d7910bb297cec5758ab");
        } else {
            this.b.add(bVar);
        }
    }

    public final long a(DataOutput dataOutput) throws IOException {
        Object[] objArr = {dataOutput};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "616089f0240aff68f84a048cfac25dbf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "616089f0240aff68f84a048cfac25dbf")).longValue();
        }
        long j = 24;
        for (int i = 0; i < this.b.size(); i++) {
            j += this.b.get(i).a().length + 12;
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putLong(j);
        allocate.flip();
        dataOutput.write(allocate.array());
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            b bVar = this.b.get(i2);
            byte[] a2 = bVar.a();
            ByteBuffer allocate2 = ByteBuffer.allocate(8);
            allocate2.order(ByteOrder.LITTLE_ENDIAN);
            allocate2.putLong(a2.length + 4);
            allocate2.flip();
            dataOutput.write(allocate2.array());
            ByteBuffer allocate3 = ByteBuffer.allocate(4);
            allocate3.order(ByteOrder.LITTLE_ENDIAN);
            allocate3.putInt(bVar.b);
            allocate3.flip();
            dataOutput.write(allocate3.array());
            dataOutput.write(a2);
        }
        ByteBuffer allocate4 = ByteBuffer.allocate(8);
        allocate4.order(ByteOrder.LITTLE_ENDIAN);
        allocate4.putLong(j);
        allocate4.flip();
        dataOutput.write(allocate4.array());
        ByteBuffer allocate5 = ByteBuffer.allocate(8);
        allocate5.order(ByteOrder.LITTLE_ENDIAN);
        allocate5.putLong(2334950737559900225L);
        allocate5.flip();
        dataOutput.write(allocate5.array());
        ByteBuffer allocate6 = ByteBuffer.allocate(8);
        allocate6.order(ByteOrder.LITTLE_ENDIAN);
        allocate6.putLong(3617552046287187010L);
        allocate6.flip();
        dataOutput.write(allocate6.array());
        return j;
    }
}
