package abc;

class Single{
		private static Single INSTANCE=new Single();
		private Single() {}
		public static Single getInstance () {
			return INSTANCE;
		}
}