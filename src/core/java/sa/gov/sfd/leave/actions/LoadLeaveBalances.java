package sa.gov.sfd.leave.actions;

import com.google.inject.Inject;
import sa.gov.sfd.leave.core.balance.BalanceServices;
import sa.gov.sfd.leave.core.balance.LeaveBalances;
import sa.gov.sfd.leaveapproval.core.EmployeeNID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author abdullahalgarni on 07/05/2020 AD
 * @project leaveSys
 **/
@Service
public class LoadLeaveBalances {

    private BalanceServices balanceServices;

    @Autowired
    public LoadLeaveBalances(BalanceServices balanceServices) {
        this.balanceServices = balanceServices;
    }

   public List<LeaveBalances>  loadLeaveBalances(EmployeeNID employeeNID){
        return balanceServices.calculateLeaveEntitlementRemaining(employeeNID);
   }
}
