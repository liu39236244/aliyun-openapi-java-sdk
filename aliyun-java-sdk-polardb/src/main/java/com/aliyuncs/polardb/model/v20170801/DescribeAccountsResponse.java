/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeAccountsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccountsResponse extends AcsResponse {

	private String requestId;

	private List<DBAccount> accounts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBAccount> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(List<DBAccount> accounts) {
		this.accounts = accounts;
	}

	public static class DBAccount {

		private String accountName;

		private String accountStatus;

		private String accountDescription;

		private String accountType;

		private String accountLockState;

		private String privilegeExceeded;

		private List<DatabasePrivilege> databasePrivileges;

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public String getAccountStatus() {
			return this.accountStatus;
		}

		public void setAccountStatus(String accountStatus) {
			this.accountStatus = accountStatus;
		}

		public String getAccountDescription() {
			return this.accountDescription;
		}

		public void setAccountDescription(String accountDescription) {
			this.accountDescription = accountDescription;
		}

		public String getAccountType() {
			return this.accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public String getAccountLockState() {
			return this.accountLockState;
		}

		public void setAccountLockState(String accountLockState) {
			this.accountLockState = accountLockState;
		}

		public String getPrivilegeExceeded() {
			return this.privilegeExceeded;
		}

		public void setPrivilegeExceeded(String privilegeExceeded) {
			this.privilegeExceeded = privilegeExceeded;
		}

		public List<DatabasePrivilege> getDatabasePrivileges() {
			return this.databasePrivileges;
		}

		public void setDatabasePrivileges(List<DatabasePrivilege> databasePrivileges) {
			this.databasePrivileges = databasePrivileges;
		}

		public static class DatabasePrivilege {

			private String dBName;

			private String accountPrivilege;

			public String getDBName() {
				return this.dBName;
			}

			public void setDBName(String dBName) {
				this.dBName = dBName;
			}

			public String getAccountPrivilege() {
				return this.accountPrivilege;
			}

			public void setAccountPrivilege(String accountPrivilege) {
				this.accountPrivilege = accountPrivilege;
			}
		}
	}

	@Override
	public DescribeAccountsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAccountsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
