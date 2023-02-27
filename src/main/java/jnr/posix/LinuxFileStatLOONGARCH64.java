package jnr.posix;

import jnr.ffi.StructLayout;
import jnr.posix.util.Platform;

public final class LinuxFileStatLOONGARCH64 extends BaseFileStat implements NanosecondFileStat {
    public static final class Layout extends StructLayout {

        public Layout(jnr.ffi.Runtime runtime) {
            super(runtime);
        }

        public final Unsigned64 st_dev = new Unsigned64();
	public final Unsigned64 st_ino = new Unsigned64();
	public final Unsigned32 st_mode = new Unsigned32();
	public final Unsigned32 st_nlink = new Unsigned32();
	public final Unsigned32 st_uid = new Unsigned32();
	public final Unsigned32 st_gid = new Unsigned32();
	public final Unsigned64 st_rdev = new Unsigned64();
	
	public final Unsigned64 __pad1 = new Unsigned64();

	public final Signed64 st_size = new Signed64();
	public final Signed32 st_blksize = new Signed32();

	public final Unsigned32 __pad2 = new Unsigned32();
	
	public final Signed64 st_blocks = new Signed64();
	public final Signed64 st_atime = new Signed64();
	public final Unsigned64 st_atimensec = new Unsigned64();
	public final Signed64 st_mtime = new Signed64();
	public final Unsigned64 st_mtimensec = new Unsigned64();
	public final Signed64 st_ctime = new Signed64();
	public final Unsigned64 st_ctimensec = new Unsigned64();
	public final Unsigned32 __pad31 = new Unsigned32();
	public final Unsigned32 __pad32 = new Unsigned32();
    }

    private static final Layout layout = new Layout(jnr.ffi.Runtime.getSystemRuntime());

    public LinuxFileStatLOONGARCH64(LinuxPOSIX posix) {
        super(posix, layout);
    }

    public long atime() {
        return layout.st_atime.get(memory);
    }

    public long aTimeNanoSecs() {
        return layout.st_atimensec.get(memory);
    }

    public long blockSize() {
        return layout.st_blksize.get(memory);
    }

    public long blocks() {
        return layout.st_blocks.get(memory);
    }

    public long ctime() {
        return layout.st_ctime.get(memory);
    }

    public long cTimeNanoSecs() {
        return layout.st_ctimensec.get(memory);
    }

    public long dev() {
        return layout.st_dev.get(memory);
    }

    public int gid() {
        return (int) layout.st_gid.get(memory);
    }

    public long ino() {
        return layout.st_ino.get(memory);
    }

    public int mode() {
        return (int) layout.st_mode.get(memory);
    }

    public long mtime() {
        return layout.st_mtime.get(memory);
    }

    public long mTimeNanoSecs() {
        return layout.st_mtimensec.get(memory);
    }

    public int nlink() {
        return (int) layout.st_nlink.get(memory);
    }

    public long rdev() {
        return layout.st_rdev.get(memory);
    }

    public long st_size() {
        return layout. st_size.get(memory);
    }

    public int uid() {
        return (int) layout.st_uid.get(memory);
    }
}
