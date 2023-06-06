package com.dianping.nvnetwork;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.dianping.nvnetwork.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m implements d.a<q> {
    public static ChangeQuickRedirect a;
    private static final LinkedList<String> b = new LinkedList<>();
    private static final Random c = new Random();
    private static final Random d = new Random(System.currentTimeMillis());
    private com.dianping.nvnetwork.fork.b e;
    private com.dianping.nvnetwork.cache.i f;
    private final Handler g;
    private Request h;
    private Request i;
    private q j;
    private long k;
    private long l;
    private long m;
    private List<r> n;
    private boolean o;

    /* JADX WARN: Removed duplicated region for block: B:119:0x03d3 A[Catch: Exception -> 0x0744, all -> 0x0747, TryCatch #0 {all -> 0x0747, blocks: (B:19:0x0079, B:22:0x0088, B:24:0x008c, B:33:0x00a3, B:35:0x00b1, B:37:0x00b7, B:39:0x00bc, B:41:0x00c2, B:43:0x00de, B:45:0x00e7, B:47:0x00fd, B:49:0x010e, B:81:0x01e0, B:83:0x0204, B:85:0x0211, B:87:0x0241, B:89:0x0247, B:112:0x0375, B:114:0x037e, B:116:0x0386, B:117:0x03b8, B:119:0x03d3, B:151:0x0516, B:153:0x051c, B:154:0x0525, B:156:0x057b, B:158:0x0588, B:160:0x058e, B:164:0x05bf, B:168:0x05cb, B:170:0x0605, B:183:0x062c, B:172:0x0614, B:167:0x05c9, B:163:0x05bb, B:184:0x0652, B:186:0x065a, B:188:0x0662, B:190:0x066e, B:192:0x0674, B:196:0x068f, B:197:0x06e6, B:199:0x0720, B:200:0x0724, B:202:0x072a, B:121:0x03db, B:123:0x0403, B:125:0x0409, B:127:0x042c, B:129:0x0432, B:131:0x0455, B:133:0x045b, B:135:0x047e, B:137:0x0484, B:139:0x04a7, B:141:0x04ad, B:143:0x04d0, B:145:0x04d6, B:147:0x04f9, B:149:0x04ff, B:148:0x04fd, B:144:0x04d4, B:140:0x04ab, B:136:0x0482, B:132:0x0459, B:128:0x0430, B:124:0x0407, B:92:0x0255, B:95:0x025d, B:97:0x0265, B:99:0x026b, B:101:0x0273, B:104:0x0284, B:106:0x02c5, B:107:0x02ce, B:109:0x02d8, B:110:0x02e5, B:84:0x020b, B:80:0x01db, B:48:0x010a, B:25:0x008f, B:27:0x0095), top: B:234:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03db A[Catch: Exception -> 0x0744, all -> 0x0747, TryCatch #0 {all -> 0x0747, blocks: (B:19:0x0079, B:22:0x0088, B:24:0x008c, B:33:0x00a3, B:35:0x00b1, B:37:0x00b7, B:39:0x00bc, B:41:0x00c2, B:43:0x00de, B:45:0x00e7, B:47:0x00fd, B:49:0x010e, B:81:0x01e0, B:83:0x0204, B:85:0x0211, B:87:0x0241, B:89:0x0247, B:112:0x0375, B:114:0x037e, B:116:0x0386, B:117:0x03b8, B:119:0x03d3, B:151:0x0516, B:153:0x051c, B:154:0x0525, B:156:0x057b, B:158:0x0588, B:160:0x058e, B:164:0x05bf, B:168:0x05cb, B:170:0x0605, B:183:0x062c, B:172:0x0614, B:167:0x05c9, B:163:0x05bb, B:184:0x0652, B:186:0x065a, B:188:0x0662, B:190:0x066e, B:192:0x0674, B:196:0x068f, B:197:0x06e6, B:199:0x0720, B:200:0x0724, B:202:0x072a, B:121:0x03db, B:123:0x0403, B:125:0x0409, B:127:0x042c, B:129:0x0432, B:131:0x0455, B:133:0x045b, B:135:0x047e, B:137:0x0484, B:139:0x04a7, B:141:0x04ad, B:143:0x04d0, B:145:0x04d6, B:147:0x04f9, B:149:0x04ff, B:148:0x04fd, B:144:0x04d4, B:140:0x04ab, B:136:0x0482, B:132:0x0459, B:128:0x0430, B:124:0x0407, B:92:0x0255, B:95:0x025d, B:97:0x0265, B:99:0x026b, B:101:0x0273, B:104:0x0284, B:106:0x02c5, B:107:0x02ce, B:109:0x02d8, B:110:0x02e5, B:84:0x020b, B:80:0x01db, B:48:0x010a, B:25:0x008f, B:27:0x0095), top: B:234:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05bb A[Catch: Exception -> 0x0744, all -> 0x0747, TryCatch #0 {all -> 0x0747, blocks: (B:19:0x0079, B:22:0x0088, B:24:0x008c, B:33:0x00a3, B:35:0x00b1, B:37:0x00b7, B:39:0x00bc, B:41:0x00c2, B:43:0x00de, B:45:0x00e7, B:47:0x00fd, B:49:0x010e, B:81:0x01e0, B:83:0x0204, B:85:0x0211, B:87:0x0241, B:89:0x0247, B:112:0x0375, B:114:0x037e, B:116:0x0386, B:117:0x03b8, B:119:0x03d3, B:151:0x0516, B:153:0x051c, B:154:0x0525, B:156:0x057b, B:158:0x0588, B:160:0x058e, B:164:0x05bf, B:168:0x05cb, B:170:0x0605, B:183:0x062c, B:172:0x0614, B:167:0x05c9, B:163:0x05bb, B:184:0x0652, B:186:0x065a, B:188:0x0662, B:190:0x066e, B:192:0x0674, B:196:0x068f, B:197:0x06e6, B:199:0x0720, B:200:0x0724, B:202:0x072a, B:121:0x03db, B:123:0x0403, B:125:0x0409, B:127:0x042c, B:129:0x0432, B:131:0x0455, B:133:0x045b, B:135:0x047e, B:137:0x0484, B:139:0x04a7, B:141:0x04ad, B:143:0x04d0, B:145:0x04d6, B:147:0x04f9, B:149:0x04ff, B:148:0x04fd, B:144:0x04d4, B:140:0x04ab, B:136:0x0482, B:132:0x0459, B:128:0x0430, B:124:0x0407, B:92:0x0255, B:95:0x025d, B:97:0x0265, B:99:0x026b, B:101:0x0273, B:104:0x0284, B:106:0x02c5, B:107:0x02ce, B:109:0x02d8, B:110:0x02e5, B:84:0x020b, B:80:0x01db, B:48:0x010a, B:25:0x008f, B:27:0x0095), top: B:234:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05c9 A[Catch: Exception -> 0x0744, all -> 0x0747, TryCatch #0 {all -> 0x0747, blocks: (B:19:0x0079, B:22:0x0088, B:24:0x008c, B:33:0x00a3, B:35:0x00b1, B:37:0x00b7, B:39:0x00bc, B:41:0x00c2, B:43:0x00de, B:45:0x00e7, B:47:0x00fd, B:49:0x010e, B:81:0x01e0, B:83:0x0204, B:85:0x0211, B:87:0x0241, B:89:0x0247, B:112:0x0375, B:114:0x037e, B:116:0x0386, B:117:0x03b8, B:119:0x03d3, B:151:0x0516, B:153:0x051c, B:154:0x0525, B:156:0x057b, B:158:0x0588, B:160:0x058e, B:164:0x05bf, B:168:0x05cb, B:170:0x0605, B:183:0x062c, B:172:0x0614, B:167:0x05c9, B:163:0x05bb, B:184:0x0652, B:186:0x065a, B:188:0x0662, B:190:0x066e, B:192:0x0674, B:196:0x068f, B:197:0x06e6, B:199:0x0720, B:200:0x0724, B:202:0x072a, B:121:0x03db, B:123:0x0403, B:125:0x0409, B:127:0x042c, B:129:0x0432, B:131:0x0455, B:133:0x045b, B:135:0x047e, B:137:0x0484, B:139:0x04a7, B:141:0x04ad, B:143:0x04d0, B:145:0x04d6, B:147:0x04f9, B:149:0x04ff, B:148:0x04fd, B:144:0x04d4, B:140:0x04ab, B:136:0x0482, B:132:0x0459, B:128:0x0430, B:124:0x0407, B:92:0x0255, B:95:0x025d, B:97:0x0265, B:99:0x026b, B:101:0x0273, B:104:0x0284, B:106:0x02c5, B:107:0x02ce, B:109:0x02d8, B:110:0x02e5, B:84:0x020b, B:80:0x01db, B:48:0x010a, B:25:0x008f, B:27:0x0095), top: B:234:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0605 A[Catch: Exception -> 0x0744, all -> 0x0747, TryCatch #0 {all -> 0x0747, blocks: (B:19:0x0079, B:22:0x0088, B:24:0x008c, B:33:0x00a3, B:35:0x00b1, B:37:0x00b7, B:39:0x00bc, B:41:0x00c2, B:43:0x00de, B:45:0x00e7, B:47:0x00fd, B:49:0x010e, B:81:0x01e0, B:83:0x0204, B:85:0x0211, B:87:0x0241, B:89:0x0247, B:112:0x0375, B:114:0x037e, B:116:0x0386, B:117:0x03b8, B:119:0x03d3, B:151:0x0516, B:153:0x051c, B:154:0x0525, B:156:0x057b, B:158:0x0588, B:160:0x058e, B:164:0x05bf, B:168:0x05cb, B:170:0x0605, B:183:0x062c, B:172:0x0614, B:167:0x05c9, B:163:0x05bb, B:184:0x0652, B:186:0x065a, B:188:0x0662, B:190:0x066e, B:192:0x0674, B:196:0x068f, B:197:0x06e6, B:199:0x0720, B:200:0x0724, B:202:0x072a, B:121:0x03db, B:123:0x0403, B:125:0x0409, B:127:0x042c, B:129:0x0432, B:131:0x0455, B:133:0x045b, B:135:0x047e, B:137:0x0484, B:139:0x04a7, B:141:0x04ad, B:143:0x04d0, B:145:0x04d6, B:147:0x04f9, B:149:0x04ff, B:148:0x04fd, B:144:0x04d4, B:140:0x04ab, B:136:0x0482, B:132:0x0459, B:128:0x0430, B:124:0x0407, B:92:0x0255, B:95:0x025d, B:97:0x0265, B:99:0x026b, B:101:0x0273, B:104:0x0284, B:106:0x02c5, B:107:0x02ce, B:109:0x02d8, B:110:0x02e5, B:84:0x020b, B:80:0x01db, B:48:0x010a, B:25:0x008f, B:27:0x0095), top: B:234:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x065a A[Catch: Exception -> 0x0744, all -> 0x0747, TryCatch #0 {all -> 0x0747, blocks: (B:19:0x0079, B:22:0x0088, B:24:0x008c, B:33:0x00a3, B:35:0x00b1, B:37:0x00b7, B:39:0x00bc, B:41:0x00c2, B:43:0x00de, B:45:0x00e7, B:47:0x00fd, B:49:0x010e, B:81:0x01e0, B:83:0x0204, B:85:0x0211, B:87:0x0241, B:89:0x0247, B:112:0x0375, B:114:0x037e, B:116:0x0386, B:117:0x03b8, B:119:0x03d3, B:151:0x0516, B:153:0x051c, B:154:0x0525, B:156:0x057b, B:158:0x0588, B:160:0x058e, B:164:0x05bf, B:168:0x05cb, B:170:0x0605, B:183:0x062c, B:172:0x0614, B:167:0x05c9, B:163:0x05bb, B:184:0x0652, B:186:0x065a, B:188:0x0662, B:190:0x066e, B:192:0x0674, B:196:0x068f, B:197:0x06e6, B:199:0x0720, B:200:0x0724, B:202:0x072a, B:121:0x03db, B:123:0x0403, B:125:0x0409, B:127:0x042c, B:129:0x0432, B:131:0x0455, B:133:0x045b, B:135:0x047e, B:137:0x0484, B:139:0x04a7, B:141:0x04ad, B:143:0x04d0, B:145:0x04d6, B:147:0x04f9, B:149:0x04ff, B:148:0x04fd, B:144:0x04d4, B:140:0x04ab, B:136:0x0482, B:132:0x0459, B:128:0x0430, B:124:0x0407, B:92:0x0255, B:95:0x025d, B:97:0x0265, B:99:0x026b, B:101:0x0273, B:104:0x0284, B:106:0x02c5, B:107:0x02ce, B:109:0x02d8, B:110:0x02e5, B:84:0x020b, B:80:0x01db, B:48:0x010a, B:25:0x008f, B:27:0x0095), top: B:234:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0204 A[Catch: Exception -> 0x0742, all -> 0x0747, TryCatch #0 {all -> 0x0747, blocks: (B:19:0x0079, B:22:0x0088, B:24:0x008c, B:33:0x00a3, B:35:0x00b1, B:37:0x00b7, B:39:0x00bc, B:41:0x00c2, B:43:0x00de, B:45:0x00e7, B:47:0x00fd, B:49:0x010e, B:81:0x01e0, B:83:0x0204, B:85:0x0211, B:87:0x0241, B:89:0x0247, B:112:0x0375, B:114:0x037e, B:116:0x0386, B:117:0x03b8, B:119:0x03d3, B:151:0x0516, B:153:0x051c, B:154:0x0525, B:156:0x057b, B:158:0x0588, B:160:0x058e, B:164:0x05bf, B:168:0x05cb, B:170:0x0605, B:183:0x062c, B:172:0x0614, B:167:0x05c9, B:163:0x05bb, B:184:0x0652, B:186:0x065a, B:188:0x0662, B:190:0x066e, B:192:0x0674, B:196:0x068f, B:197:0x06e6, B:199:0x0720, B:200:0x0724, B:202:0x072a, B:121:0x03db, B:123:0x0403, B:125:0x0409, B:127:0x042c, B:129:0x0432, B:131:0x0455, B:133:0x045b, B:135:0x047e, B:137:0x0484, B:139:0x04a7, B:141:0x04ad, B:143:0x04d0, B:145:0x04d6, B:147:0x04f9, B:149:0x04ff, B:148:0x04fd, B:144:0x04d4, B:140:0x04ab, B:136:0x0482, B:132:0x0459, B:128:0x0430, B:124:0x0407, B:92:0x0255, B:95:0x025d, B:97:0x0265, B:99:0x026b, B:101:0x0273, B:104:0x0284, B:106:0x02c5, B:107:0x02ce, B:109:0x02d8, B:110:0x02e5, B:84:0x020b, B:80:0x01db, B:48:0x010a, B:25:0x008f, B:27:0x0095), top: B:234:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020b A[Catch: Exception -> 0x0742, all -> 0x0747, TryCatch #0 {all -> 0x0747, blocks: (B:19:0x0079, B:22:0x0088, B:24:0x008c, B:33:0x00a3, B:35:0x00b1, B:37:0x00b7, B:39:0x00bc, B:41:0x00c2, B:43:0x00de, B:45:0x00e7, B:47:0x00fd, B:49:0x010e, B:81:0x01e0, B:83:0x0204, B:85:0x0211, B:87:0x0241, B:89:0x0247, B:112:0x0375, B:114:0x037e, B:116:0x0386, B:117:0x03b8, B:119:0x03d3, B:151:0x0516, B:153:0x051c, B:154:0x0525, B:156:0x057b, B:158:0x0588, B:160:0x058e, B:164:0x05bf, B:168:0x05cb, B:170:0x0605, B:183:0x062c, B:172:0x0614, B:167:0x05c9, B:163:0x05bb, B:184:0x0652, B:186:0x065a, B:188:0x0662, B:190:0x066e, B:192:0x0674, B:196:0x068f, B:197:0x06e6, B:199:0x0720, B:200:0x0724, B:202:0x072a, B:121:0x03db, B:123:0x0403, B:125:0x0409, B:127:0x042c, B:129:0x0432, B:131:0x0455, B:133:0x045b, B:135:0x047e, B:137:0x0484, B:139:0x04a7, B:141:0x04ad, B:143:0x04d0, B:145:0x04d6, B:147:0x04f9, B:149:0x04ff, B:148:0x04fd, B:144:0x04d4, B:140:0x04ab, B:136:0x0482, B:132:0x0459, B:128:0x0430, B:124:0x0407, B:92:0x0255, B:95:0x025d, B:97:0x0265, B:99:0x026b, B:101:0x0273, B:104:0x0284, B:106:0x02c5, B:107:0x02ce, B:109:0x02d8, B:110:0x02e5, B:84:0x020b, B:80:0x01db, B:48:0x010a, B:25:0x008f, B:27:0x0095), top: B:234:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0247 A[Catch: Exception -> 0x0744, all -> 0x0747, TryCatch #0 {all -> 0x0747, blocks: (B:19:0x0079, B:22:0x0088, B:24:0x008c, B:33:0x00a3, B:35:0x00b1, B:37:0x00b7, B:39:0x00bc, B:41:0x00c2, B:43:0x00de, B:45:0x00e7, B:47:0x00fd, B:49:0x010e, B:81:0x01e0, B:83:0x0204, B:85:0x0211, B:87:0x0241, B:89:0x0247, B:112:0x0375, B:114:0x037e, B:116:0x0386, B:117:0x03b8, B:119:0x03d3, B:151:0x0516, B:153:0x051c, B:154:0x0525, B:156:0x057b, B:158:0x0588, B:160:0x058e, B:164:0x05bf, B:168:0x05cb, B:170:0x0605, B:183:0x062c, B:172:0x0614, B:167:0x05c9, B:163:0x05bb, B:184:0x0652, B:186:0x065a, B:188:0x0662, B:190:0x066e, B:192:0x0674, B:196:0x068f, B:197:0x06e6, B:199:0x0720, B:200:0x0724, B:202:0x072a, B:121:0x03db, B:123:0x0403, B:125:0x0409, B:127:0x042c, B:129:0x0432, B:131:0x0455, B:133:0x045b, B:135:0x047e, B:137:0x0484, B:139:0x04a7, B:141:0x04ad, B:143:0x04d0, B:145:0x04d6, B:147:0x04f9, B:149:0x04ff, B:148:0x04fd, B:144:0x04d4, B:140:0x04ab, B:136:0x0482, B:132:0x0459, B:128:0x0430, B:124:0x0407, B:92:0x0255, B:95:0x025d, B:97:0x0265, B:99:0x026b, B:101:0x0273, B:104:0x0284, B:106:0x02c5, B:107:0x02ce, B:109:0x02d8, B:110:0x02e5, B:84:0x020b, B:80:0x01db, B:48:0x010a, B:25:0x008f, B:27:0x0095), top: B:234:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0253  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.dianping.nvnetwork.m r51, rx.j r52, com.dianping.nvnetwork.q r53) {
        /*
            Method dump skipped, instructions count: 2122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvnetwork.m.a(com.dianping.nvnetwork.m, rx.j, com.dianping.nvnetwork.q):void");
    }

    public static /* synthetic */ rx.d b(m mVar, final Request request) {
        rx.d c2;
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mVar, changeQuickRedirect, false, "0e13e2429eac836c155847becdad9b81", 6917529027641081856L)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, mVar, changeQuickRedirect, false, "0e13e2429eac836c155847becdad9b81");
        }
        c.a(request.b()).c();
        mVar.m = System.currentTimeMillis() - mVar.l;
        if (request.j == com.dianping.nvnetwork.cache.c.SERVICE) {
            request.a("Cache-Support", "true");
        }
        if (request.j == com.dianping.nvnetwork.cache.c.NORMAL || request.j == com.dianping.nvnetwork.cache.c.HOURLY || request.j == com.dianping.nvnetwork.cache.c.DAILY || request.j == com.dianping.nvnetwork.cache.c.SERVICE) {
            c2 = mVar.f.exec(request).c(new rx.functions.g<q, rx.d<q>>() { // from class: com.dianping.nvnetwork.m.4
                public static ChangeQuickRedirect a;

                @Override // rx.functions.g
                public final /* synthetic */ rx.d<q> call(q qVar) {
                    q qVar2 = qVar;
                    Object[] objArr2 = {qVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31fa8653d8090520dcf318625ca31121", 6917529027641081856L)) {
                        return (rx.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31fa8653d8090520dcf318625ca31121");
                    }
                    if (qVar2.isSuccess() || (com.dianping.nvnetwork.cache.c.SERVICE == request.j && !qVar2.f)) {
                        m.this.j = qVar2;
                        return rx.d.a(qVar2);
                    }
                    return m.this.e.exec(request).d(new rx.functions.g<q, q>() { // from class: com.dianping.nvnetwork.m.4.1
                        public static ChangeQuickRedirect a;

                        @Override // rx.functions.g
                        public final /* synthetic */ q call(q qVar3) {
                            q qVar4 = qVar3;
                            Object[] objArr3 = {qVar4};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "adad0a61412c4f47baf267116b801dc3", 6917529027641081856L)) {
                                return (q) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "adad0a61412c4f47baf267116b801dc3");
                            }
                            m.this.j = qVar4;
                            m.this.k = System.currentTimeMillis() - m.this.l;
                            qVar4.a(m.this.k);
                            return qVar4;
                        }
                    });
                }
            });
        } else {
            c2 = mVar.e.exec(request).c(new rx.functions.g<q, rx.d<q>>() { // from class: com.dianping.nvnetwork.m.5
                public static ChangeQuickRedirect a;

                @Override // rx.functions.g
                public final /* synthetic */ rx.d<q> call(q qVar) {
                    final q qVar2 = qVar;
                    Object[] objArr2 = {qVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "548a381e056e974f0f59ac8e4d37c4ef", 6917529027641081856L)) {
                        return (rx.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "548a381e056e974f0f59ac8e4d37c4ef");
                    }
                    m.this.j = qVar2;
                    m.this.k = System.currentTimeMillis() - m.this.l;
                    qVar2.a(m.this.k);
                    if (!qVar2.isSuccess() && request.j == com.dianping.nvnetwork.cache.c.CRITICAL) {
                        return m.this.f.exec(request).d(new rx.functions.g<q, q>() { // from class: com.dianping.nvnetwork.m.5.1
                            public static ChangeQuickRedirect a;

                            @Override // rx.functions.g
                            public final /* synthetic */ q call(q qVar3) {
                                q qVar4 = qVar3;
                                Object[] objArr3 = {qVar4};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4f2d557005b6c0453a1bb21555f5284b", 6917529027641081856L) ? (q) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4f2d557005b6c0453a1bb21555f5284b") : qVar4.isSuccess() ? qVar4 : qVar2;
                            }
                        });
                    }
                    return rx.d.a(qVar2);
                }
            });
        }
        return c2.b((rx.functions.b) new rx.functions.b<q>() { // from class: com.dianping.nvnetwork.m.6
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(q qVar) {
                q qVar2 = qVar;
                Object[] objArr2 = {qVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "caf0d5439db040936f96695856d1b7ef", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "caf0d5439db040936f96695856d1b7ef");
                } else if (!qVar2.f) {
                    if (m.this.j != null) {
                        if (m.this.j.isSuccess()) {
                            if (m.this.i.j != com.dianping.nvnetwork.cache.c.DISABLED && qVar2.isSuccess() && qVar2.result() != null && m.this.i.f.equals("GET") && m.this.j.statusCode() / 100 == 2) {
                                m.this.g.sendMessage(m.this.g.obtainMessage(0, new a(m.this.i, m.this.j)));
                            }
                        } else if (m.this.i.j == com.dianping.nvnetwork.cache.c.FORCE) {
                            m.this.g.sendMessage(m.this.g.obtainMessage(1, m.this.i));
                        }
                    }
                } else if (!qVar2.isSuccess()) {
                    m.this.f.a(m.this.i);
                } else {
                    com.dianping.nvnetwork.util.g.a("finish (cache." + request.j + ") " + request.d);
                }
            }
        });
    }

    @Override // rx.functions.b
    public final /* synthetic */ void call(Object obj) {
        final rx.j jVar = (rx.j) obj;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65223b0b4902faa12094e8e408176bd3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65223b0b4902faa12094e8e408176bd3");
        } else if (jVar.isUnsubscribed()) {
        } else {
            if (g.p() && g.s() > 0) {
                jVar.onError(new Exception("这是一个模拟网络错误 倒数:" + g.s()));
                com.dianping.nvnetwork.util.g.a("这是一个模拟网络错误 倒数:" + g.s());
                g.d(g.s() - 1);
            } else if (g.p() && g.r() > 0 && c.nextInt(100) <= g.r()) {
                jVar.onError(new Exception("这是一个模拟网络错误."));
                com.dianping.nvnetwork.util.g.a("这是一个模拟网络错误");
            } else {
                if (g.p() && g.q() > 0) {
                    try {
                        Thread.sleep(g.q());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                this.i = this.h.a().build();
                new b(0, this.i).a(this.i).a(new rx.functions.b<q>() { // from class: com.dianping.nvnetwork.m.2
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.b
                    public final /* synthetic */ void call(q qVar) {
                        q qVar2 = qVar;
                        Object[] objArr2 = {qVar2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de8b25187016be9f85062617fde0adb2", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de8b25187016be9f85062617fde0adb2");
                            return;
                        }
                        if (m.this.j == null) {
                            m.this.j = qVar2;
                        }
                        m.a(m.this, jVar, qVar2);
                    }
                }, new rx.functions.b<Throwable>() { // from class: com.dianping.nvnetwork.m.3
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.b
                    public final /* synthetic */ void call(Throwable th) {
                        Throwable th2 = th;
                        Object[] objArr2 = {th2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e8fcd4a9f2d265a4b8164436a8e0275", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e8fcd4a9f2d265a4b8164436a8e0275");
                        } else if (jVar.isUnsubscribed() || Thread.currentThread().isInterrupted()) {
                        } else {
                            jVar.onError(th2);
                        }
                    }
                });
            }
        }
    }

    public m(Request request, com.dianping.nvnetwork.fork.b bVar, com.dianping.nvnetwork.cache.i iVar, List<r> list, boolean z) {
        Object[] objArr = {request, bVar, iVar, list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2ede843571d07b86e07180191b7a89d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2ede843571d07b86e07180191b7a89d");
            return;
        }
        this.g = new Handler(com.dianping.nvnetwork.util.d.b()) { // from class: com.dianping.nvnetwork.m.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "871930a3d9c2c1e45551d57611f06dc6", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "871930a3d9c2c1e45551d57611f06dc6");
                    return;
                }
                Bundle data = message.getData();
                switch (message.what) {
                    case 0:
                        if (data != null) {
                            a aVar = (a) message.obj;
                            m.this.f.a(aVar.a, aVar.b);
                            return;
                        }
                        return;
                    case 1:
                        if (data != null) {
                            m.this.f.a((Request) message.obj);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        };
        this.h = request;
        this.e = bVar;
        this.f = iVar;
        if (request.t == 0) {
            if (g.w() != null && g.w().size() > 0) {
                this.n = new ArrayList(list.size() + g.w().size());
                this.n.addAll(list);
                this.n.addAll(g.w());
            } else {
                this.n = list;
            }
        } else if (request.t == 1) {
            this.n = Collections.EMPTY_LIST;
        } else if (request.t == 2) {
            this.n = list;
        }
        this.o = z;
        this.l = System.currentTimeMillis();
        c.a(request.b()).a();
    }

    public static String a() {
        String sb;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc1ac2cda4bc6eb86538a25f8b83e285", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc1ac2cda4bc6eb86538a25f8b83e285");
        }
        synchronized (b) {
            StringBuilder sb2 = new StringBuilder();
            Iterator<String> it = b.iterator();
            while (it.hasNext()) {
                sb2.append("\n");
                sb2.append(it.next());
            }
            sb = sb2.toString();
        }
        return sb;
    }

    private int a(com.dianping.nvnetwork.shark.monitor.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3755aa78f3f59004f0194f9d0b4908d9", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3755aa78f3f59004f0194f9d0b4908d9")).intValue();
        }
        if (eVar == null) {
            return 5;
        }
        switch (eVar) {
            case GOOD:
                return 1;
            case MODERATE:
                return 2;
            case BAD:
                return 3;
            case OFFLINE:
                return 4;
            default:
                return 5;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public Request a;
        public q b;

        public a(Request request, q qVar) {
            this.a = request;
            this.b = qVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b implements r.a {
        public static ChangeQuickRedirect a;
        private final int c;
        private int d;
        private final Request e;

        public b(int i, Request request) {
            Object[] objArr = {m.this, Integer.valueOf(i), request};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65b59b06cdeea69af39eda6be2d8939e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65b59b06cdeea69af39eda6be2d8939e");
                return;
            }
            this.c = i;
            this.e = request;
        }

        @Override // com.dianping.nvnetwork.r.a
        public final Request a() {
            return this.e;
        }

        @Override // com.dianping.nvnetwork.r.a
        public final rx.d<q> a(Request request) {
            Object[] objArr = {request};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b50c3c9c951517082417589ba8d6fcc", 6917529027641081856L)) {
                return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b50c3c9c951517082417589ba8d6fcc");
            }
            if (!request.b().equals(m.this.h.b())) {
                request = request.a().reqId(m.this.h.b()).build();
            }
            this.d++;
            if (this.c > 0) {
                r rVar = (r) m.this.n.get(this.c - 1);
                if (this.d > 1) {
                    throw new IllegalStateException("network interceptor " + rVar + " must call proceed() exactly once");
                }
            }
            if (this.c >= m.this.n.size()) {
                m.this.i = request;
                return m.b(m.this, request);
            }
            b bVar = new b(this.c + 1, request);
            r rVar2 = (r) m.this.n.get(this.c);
            rx.d<q> intercept = rVar2.intercept(bVar);
            if (intercept != null) {
                return intercept;
            }
            throw new NullPointerException("network interceptor " + rVar2 + " returned null");
        }
    }

    private static int a(HashMap<String, String> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f5f2c19993b35cfe219ad291a45cb25", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f5f2c19993b35cfe219ad291a45cb25")).intValue();
        }
        if (hashMap == null || hashMap.size() == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : hashMap.keySet()) {
            sb.append(str);
            sb.append(hashMap.get(str));
        }
        return sb.toString().getBytes().length;
    }
}
