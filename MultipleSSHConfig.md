#### Step 1: Check Existing SSH Keys

>ls -al ~/.ssh

#### Step 2: Generate SSH Key for Each Git Account

> ssh-keygen -t rsa -b 4096 -C "your_email@example.com" \
> (Enter a unique file name, e.g., id_rsa_account1)

#### Step 3: Add SSH Keys to SSH Agent

> ssh-add ~/.ssh/id_rsa_account1

#### Step 4: Add SSH Keys to Respective Git Accounts

> cat ~/.ssh/id_rsa_account1.pub

#### Step 5: Configure SSH for Multiple Accounts

> nano ~/.ssh/config
>> #### Account 1 
>> Host github.com-account1 \
HostName github.com \
User git \
IdentityFile ~/.ssh/id_rsa_account1 \
>> #### Account 2
>> Host github.com-account2 \
HostName github.com \
User git \
IdentityFile ~/.ssh/id_rsa_account2 \

#### Step 6: Test SSH Connection
> ssh -T git@github.com-account1 \
ssh -T git@github.com-account2

