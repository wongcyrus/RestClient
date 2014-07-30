package hk.edu.vtc.it.cloudservices.client;

public class MemberResponse {
	private MemberEmbedded _embedded;
	private PageInformation page;

	public MemberEmbedded get_embedded() {
		return _embedded;
	}

	public void set_embedded(MemberEmbedded _embedded) {
		this._embedded = _embedded;
	}

	public PageInformation getPage() {
		return page;
	}

	public void setPage(PageInformation page) {
		this.page = page;
	}

	public class MemberEmbedded {
		private Member[] members;

		public Member[] getMembers() {
			return members;
		}

		public void setMembers(Member[] members) {
			this.members = members;
		}
	}

	/*
	 * "page" : { "size" : 20, "totalElements" : 9, "totalPages" : 1, "number" :
	 * 0 }
	 */

	public class PageInformation {
		private int size;
		private int totalElements;
		private int number;

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}

		public int getTotalElements() {
			return totalElements;
		}

		public void setTotalElements(int totalElements) {
			this.totalElements = totalElements;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		@Override
		public String toString() {
			return "PageInformation [size=" + size + ", totalElements="
					+ totalElements + ", number=" + number + "]";
		}

	}
}
